package co.uco.observaciones.controllers;

import co.uco.observaciones.domain.bitacora.Bitacora;
import co.uco.observaciones.repository.BitacoraRepository;
import co.uco.observaciones.services.BitacoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bitacoras")
public class BitacoraController {

    @Autowired
    private BitacoraService bitacoraService;

    @GetMapping("/completadas")
    public List<Bitacora> obtenerBitacorasCompletadas() {
        return bitacoraService.obtenerBitacorasCompletadas();
    }
}