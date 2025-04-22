package pe.gob.sbn.sinabip.core.entidades.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.entidades.repository.EntidadRepository;
import pe.gob.sbn.sinabip.core.entidades.service.inf.EntidadService;

@Service
public class EntidadServiceImpl implements EntidadService {

    private final EntidadRepository entidadRepository;

    public EntidadServiceImpl(EntidadRepository entidadRepository) {
        this.entidadRepository = entidadRepository;
    }

    @Override
    public ApiResponse existsByCodigo(String ruc) {
        return ApiResponse.builder()
                .codigo(HttpStatus.OK.value())
                .mensaje("OK")
                .data(this.entidadRepository.existsByRuc(ruc) ? "EXISTE" : "NO EXISTE")
                .build();

    }
}
