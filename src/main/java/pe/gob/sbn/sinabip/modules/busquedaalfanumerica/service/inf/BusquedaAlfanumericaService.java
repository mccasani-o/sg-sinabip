package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf;

import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;

import java.util.List;

public interface BusquedaAlfanumericaService {

    List<BusquedaAlfanumericaResponse> obtenerBusquedaPredios(BusquedaAlfanumericaRequest request);
}
