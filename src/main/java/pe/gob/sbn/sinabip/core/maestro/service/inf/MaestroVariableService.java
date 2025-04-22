package pe.gob.sbn.sinabip.core.maestro.service.inf;

import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;

import java.util.List;

public interface MaestroVariableService {

    ApiResponse obtenerCodigoMaestro(String codigoMaestro);

    ApiResponse obtenerMaestroCalificacion(String codigoMaestro);
}
