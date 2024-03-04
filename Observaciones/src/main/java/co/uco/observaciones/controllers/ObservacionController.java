package co.uco.observaciones.controllers;

import co.uco.observaciones.domain.observacion.Observacion;
import co.uco.observaciones.services.ObservacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/observaciones")
public class ObservacionController {

    @Autowired
    private ObservacionService observacionService;

    @GetMapping("/bitacora/{bitacoraId}")
    @ResponseStatus (HttpStatus.ACCEPTED)
    public Observacion obtenerInformacionBitacora(@PathVariable long bitacoraId) {
        return observacionService.obtenerInformacionBitacora(bitacoraId);

    }
}