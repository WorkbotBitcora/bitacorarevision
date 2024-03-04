package co.uco.observaciones.services;

import co.uco.observaciones.domain.bitacora.Bitacora;
import co.uco.observaciones.repository.BitacoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BitacoraService {

    @Autowired
    private BitacoraRepository bitacoraRepository;

    public List<Bitacora> obtenerBitacorasCompletadas() {
        List<Bitacora> Completados = new ArrayList<Bitacora>();
        for (int i = 0; i >= bitacoraRepository.findAll().size(); i++) {
            if (bitacoraRepository.findById((long) i).equals("Completado")) {
                bitacoraRepository.findById((long) i).ifPresent(bitacora -> {
                    Completados.add(bitacora);
                });
            }
        }
        return Completados;
    }
}

//Hacer pruebas previas al metodo jajaja
