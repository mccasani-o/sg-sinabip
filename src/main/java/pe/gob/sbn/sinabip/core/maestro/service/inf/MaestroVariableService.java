package pe.gob.sbn.sinabip.core.maestro.service.inf;

import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;

import java.util.List;

public interface MaestroVariableService {

    List<MaestroVariableDto> obtenerCodigoMaestro(String codigoMaestro);

    List<MaestroVariableDto> obtenerMaestroCalificacion(String codigoMaestro);
}
