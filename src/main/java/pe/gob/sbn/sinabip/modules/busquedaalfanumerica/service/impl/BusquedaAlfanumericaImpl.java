package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.mapper.BusquedaAlfanumericaMapper;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.inf.BusquedaAlfanumericaDao;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.inf.BusquedaAlfanumericaService;

import java.util.List;

@Slf4j
@Service
public class BusquedaAlfanumericaImpl implements BusquedaAlfanumericaService {

    private final BusquedaAlfanumericaDao busquedaAlfanumericaDao;

    public BusquedaAlfanumericaImpl(BusquedaAlfanumericaDao busquedaAlfanumericaDao) {
        this.busquedaAlfanumericaDao = busquedaAlfanumericaDao;
    }

    @Override
    public BusquedaResponse obtenerBusquedaPredios(BusquedaAlfanumericaRequest request) {
        List<BusquedaAlfanumericaDto> alfanumericaDtos = this.busquedaAlfanumericaDao.obtenerBusquedaPredios(request);

        List<BusquedaAlfanumericaResponse> responses = alfanumericaDtos.stream()
                .map(BusquedaAlfanumericaMapper::mapToBusquedaAlfanumericaResponse)
                .toList();
        log.info("BusquedaAlfanumericaResponse size: {}",responses.size());
        return BusquedaResponse.builder()
                .data(responses)
                .total(responses.size())
                .build();
    }

}
