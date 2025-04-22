package pe.gob.sbn.sinabip.core.entidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.entidades.service.inf.EntidadService;

@RestController
@RequestMapping("/api/v1/entidades")
public class EntidadController {

    private final EntidadService entidadService;


    public EntidadController(EntidadService entidadService) {
        this.entidadService = entidadService;
    }

    @GetMapping("/{ruc}")
    public ApiResponse validarExistenciaRuc(@PathVariable String ruc){
        return this.entidadService.existsByCodigo(ruc);
    }
}
