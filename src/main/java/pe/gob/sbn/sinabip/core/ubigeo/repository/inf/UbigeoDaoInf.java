package pe.gob.sbn.sinabip.core.ubigeo.repository.inf;

import pe.gob.sbn.sinabip.core.ubigeo.model.Ubigeo;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;

import java.util.List;

public interface UbigeoDaoInf {
    List<Ubigeo> obtenerObigeo(UbigeoRequest request);
}
