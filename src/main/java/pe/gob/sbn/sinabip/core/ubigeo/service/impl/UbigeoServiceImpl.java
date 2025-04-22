package pe.gob.sbn.sinabip.core.ubigeo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.ubigeo.mapper.UbigeoMapper;
import pe.gob.sbn.sinabip.core.ubigeo.model.response.UbigeoResponse;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;
import pe.gob.sbn.sinabip.core.ubigeo.repository.inf.UbigeoDaoInf;
import pe.gob.sbn.sinabip.core.ubigeo.service.inf.UbigeoService;

import java.util.List;

@Service
public class UbigeoServiceImpl implements UbigeoService {
    private final UbigeoDaoInf ubigeoDao;

    public UbigeoServiceImpl(UbigeoDaoInf ubigeoDao) {
        this.ubigeoDao = ubigeoDao;
    }

    @Override
    public ApiResponse obtenerUbigeo(UbigeoRequest request) {

        List<UbigeoResponse> responses = this.ubigeoDao.obtenerObigeo(request)
                .stream()
                .map(ubigeo -> UbigeoMapper.mapToUbigeoResponse(ubigeo, request))
                .toList();

        return ApiResponse.builder()
                .codigo(HttpStatus.OK.value())
                .mensaje("OK")
                .data(responses)
                .build();
    }
}
