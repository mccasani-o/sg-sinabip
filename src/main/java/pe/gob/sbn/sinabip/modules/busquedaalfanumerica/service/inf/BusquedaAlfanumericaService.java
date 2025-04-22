package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf;

import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaResponse;

public interface BusquedaAlfanumericaService {

    ApiResponse obtenerBusquedaPredios(BusquedaAlfanumericaRequest request);
}
