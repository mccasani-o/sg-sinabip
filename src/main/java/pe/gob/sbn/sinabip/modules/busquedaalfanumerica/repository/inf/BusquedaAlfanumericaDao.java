package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.repository.inf;

import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;

import java.util.List;

public interface BusquedaAlfanumericaDao {

    List<BusquedaAlfanumericaDto>obtenerBusquedaPredios(BusquedaAlfanumericaRequest request);
}
