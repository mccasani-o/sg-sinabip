package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf.BusquedaAlfanumericaService;

@RestController
@RequestMapping("/api/v1/busqueda")
public class BusquedaAlfanumericaController {
     private final BusquedaAlfanumericaService busquedaAlfanumericaService;

    public BusquedaAlfanumericaController(BusquedaAlfanumericaService busquedaAlfanumericaService) {
        this.busquedaAlfanumericaService = busquedaAlfanumericaService;
    }

    @PostMapping("/avanzado/predios")
    public BusquedaResponse busquedaAlfanumerica(@Validated @RequestBody BusquedaAlfanumericaRequest request){
       return this.busquedaAlfanumericaService.obtenerBusquedaPredios(request);
    }
}
