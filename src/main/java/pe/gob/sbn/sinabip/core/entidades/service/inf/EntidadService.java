package pe.gob.sbn.sinabip.core.entidades.service.inf;

import pe.gob.sbn.sinabip.common.model.ApiResponse;

public interface EntidadService {

    ApiResponse existsByCodigo(String ruc);
}
