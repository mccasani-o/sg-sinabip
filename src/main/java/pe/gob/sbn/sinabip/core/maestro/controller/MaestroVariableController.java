package pe.gob.sbn.sinabip.core.maestro.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.maestro.service.inf.MaestroVariableService;

@RestController
@RequestMapping("/api/v1/maestros")
public class MaestroVariableController {
    private final MaestroVariableService maestroVariableService;

    public MaestroVariableController(MaestroVariableService maestroVariableService) {
        this.maestroVariableService = maestroVariableService;
    }

    @GetMapping("/busqueda")
    public ApiResponse obtenerCodigoMaestro(@Valid  @RequestParam String codigoMaestro){
        return this.maestroVariableService.obtenerCodigoMaestro(codigoMaestro);
    }
    @GetMapping("/busqueda/calificacion")
    public ApiResponse obtenerMaestroCalificacion(@RequestParam String codigoMaestro){
        return this.maestroVariableService.obtenerMaestroCalificacion(codigoMaestro);
    }
}
