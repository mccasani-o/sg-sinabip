package pe.gob.sbn.sinabip.core.ubigeo.service.inf;

import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.ubigeo.model.response.UbigeoResponse;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;

import java.util.List;

public interface UbigeoService {

    ApiResponse obtenerUbigeo(UbigeoRequest request);
}
