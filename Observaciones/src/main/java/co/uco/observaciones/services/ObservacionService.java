package co.uco.observaciones.services;

import co.uco.observaciones.domain.bitacora.Bitacora;
import co.uco.observaciones.domain.bitacora.Estado;
import co.uco.observaciones.domain.observacion.Observacion;
import co.uco.observaciones.repository.BitacoraRepository;
import co.uco.observaciones.repository.ObservacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObservacionService {

    private Observacion observacionAux;

    @Autowired
    private ObservacionRepository observacionRepository;

    @Autowired
    private BitacoraRepository bitacoraRepository;

    public Observacion obtenerInformacionBitacora(long bitacoraId) {
        Observacion informacionBitacora = new Observacion() ;

        // Obtener las observaciones de fallos
         observacionRepository.findById(bitacoraId).ifPresent(dato ->{

            observacionAux = dato;

        });
        return observacionAux;
    }
    public void modificarObservacion (long id, String descripcion){
        observacionAux = obtenerInformacionBitacora(id);
        observacionAux.setDescripcion(descripcion);
        observacionRepository.save(observacionAux);
    }
    public void modificarMejora (long id, String mejora) {
        observacionAux = obtenerInformacionBitacora(id);
        observacionAux.setMejora(mejora);
        observacionRepository.save(observacionAux);

    }
    public void guardarBitacoraSinMejoras (Bitacora bitacora){
        bitacora.setEstado(new Estado(3));
        bitacoraRepository.save(bitacora);
    }
    public void guardarModificaciones (String mejora, String descripcion,Bitacora bitacora){
        modificarMejora(bitacora.getRevision().getObservacion().getId(),mejora);
        modificarObservacion(bitacora.getRevision().getObservacion().getId(),descripcion);
        bitacora.setEstado(new Estado(3));
        bitacoraRepository.save(bitacora);
    }
}
