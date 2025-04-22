package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.mapper.BusquedaAlfanumericaMapper;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaResponse;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.repository.inf.BusquedaAlfanumericaDao;
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
    public ApiResponse obtenerBusquedaPredios(BusquedaAlfanumericaRequest request) {
        List<BusquedaAlfanumericaDto> dtoList = busquedaAlfanumericaDao.obtenerBusquedaPredios(request);

        List<BusquedaAlfanumericaResponse> responseList = mapToResponseList(dtoList);
        int total = extractTotalFromFirst(responseList);

        BusquedaResponse busquedaResponse = BusquedaResponse.builder()
                .lista(responseList)
                .total(total)
                .build();

        return ApiResponse.builder()
                .codigo(HttpStatus.OK.value())
                .mensaje("ok")
                .data(busquedaResponse)
                .build();
    }

    private List<BusquedaAlfanumericaResponse> mapToResponseList(List<BusquedaAlfanumericaDto> dtoList) {
        return dtoList.stream()
                .map(BusquedaAlfanumericaMapper::mapToBusquedaAlfanumericaResponse)
                .toList();
    }

    private int extractTotalFromFirst(List<BusquedaAlfanumericaResponse> responseList) {
        return responseList.stream()
                .findFirst()
                .map(response -> response.getTotal())
                .orElse(0);
    }
}
