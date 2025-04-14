package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.impl;

import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.mapper.BusquedaAlfanumericaMapper;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.inf.BusquedaAlfanumericaDao;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf.BusquedaAlfanumericaService;

import java.util.List;

@Service
public class BusquedaAlfanumericaImpl implements BusquedaAlfanumericaService {

    private final BusquedaAlfanumericaDao busquedaAlfanumericaDao;

    public BusquedaAlfanumericaImpl(BusquedaAlfanumericaDao busquedaAlfanumericaDao) {
        this.busquedaAlfanumericaDao = busquedaAlfanumericaDao;
    }

    @Override
    public List<BusquedaAlfanumericaResponse> obtenerBusquedaPredios(BusquedaAlfanumericaRequest request) {
        return  this.busquedaAlfanumericaDao.obtenerBusquedaPredios(request)
                .stream()
                .map(busquedaAlfanumericaDto -> BusquedaAlfanumericaMapper.mapToBusquedaAlfanumericaResponse(busquedaAlfanumericaDto))
                .toList();
    }
}
