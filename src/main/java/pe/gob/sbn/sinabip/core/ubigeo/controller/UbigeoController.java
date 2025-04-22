package pe.gob.sbn.sinabip.core.ubigeo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;
import pe.gob.sbn.sinabip.core.ubigeo.service.inf.UbigeoService;

@RestController
@RequestMapping("/api/v1/ubigeos")
public class UbigeoController {

    private final UbigeoService ubigeoService;

    public UbigeoController(UbigeoService ubigeoService) {
        this.ubigeoService = ubigeoService;
    }

    @PostMapping
    public ApiResponse obtenerUbigeos(@RequestBody UbigeoRequest request) {
        return this.ubigeoService.obtenerUbigeo(request);
    }
}
