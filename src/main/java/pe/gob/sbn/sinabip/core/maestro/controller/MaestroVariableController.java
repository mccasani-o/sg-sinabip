package pe.gob.sbn.sinabip.core.maestro.controller;

import org.hibernate.query.QueryParameter;
import org.springframework.web.bind.annotation.*;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;
import pe.gob.sbn.sinabip.core.maestro.service.inf.MaestroVariableService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/maestros")
public class MaestroVariableController {
    private final MaestroVariableService maestroVariableService;

    public MaestroVariableController(MaestroVariableService maestroVariableService) {
        this.maestroVariableService = maestroVariableService;
    }

    @GetMapping("/busqueda")
    public List<MaestroVariableDto> obtenerCodigoMaestro(@RequestParam String codigoMaestro){
        return this.maestroVariableService.obtenerCodigoMaestro(codigoMaestro);
    }
    @GetMapping("/busqueda/calificacion")
    public List<MaestroVariableDto> obtenerMaestroCalificacion(@RequestParam String codigoMaestro){
        return this.maestroVariableService.obtenerMaestroCalificacion(codigoMaestro);
    }
}
