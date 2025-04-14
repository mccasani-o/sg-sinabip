package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.controller;

import org.springframework.web.bind.annotation.*;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf.BusquedaAlfanumericaService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/busqueda")
public class BusquedaAlfanumericaController {
     private final BusquedaAlfanumericaService busquedaAlfanumericaService;

    public BusquedaAlfanumericaController(BusquedaAlfanumericaService busquedaAlfanumericaService) {
        this.busquedaAlfanumericaService = busquedaAlfanumericaService;
    }

    @PostMapping("/avanzado/predios")
    public List<BusquedaAlfanumericaResponse> busquedaAlfanumerica(@RequestBody BusquedaAlfanumericaRequest request){
       return this.busquedaAlfanumericaService.obtenerBusquedaPredios(request);
    }
}
