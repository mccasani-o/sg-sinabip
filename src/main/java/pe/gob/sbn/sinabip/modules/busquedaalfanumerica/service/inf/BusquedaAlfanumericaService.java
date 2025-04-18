package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf;

import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaResponse;

public interface BusquedaAlfanumericaService {

    BusquedaResponse obtenerBusquedaPredios(BusquedaAlfanumericaRequest request);
}
