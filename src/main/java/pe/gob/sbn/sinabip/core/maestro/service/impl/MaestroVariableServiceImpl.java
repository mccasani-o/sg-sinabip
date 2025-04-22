package pe.gob.sbn.sinabip.core.maestro.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.common.constants.Constantes;
import pe.gob.sbn.sinabip.common.model.ApiResponse;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;
import pe.gob.sbn.sinabip.core.maestro.mapper.MaestroVariableMapper;
import pe.gob.sbn.sinabip.core.maestro.repository.MaestroVariableRepository;
import pe.gob.sbn.sinabip.core.maestro.service.inf.MaestroVariableService;

import java.util.Comparator;
import java.util.List;

@Slf4j
@Service
public class MaestroVariableServiceImpl implements MaestroVariableService {

    private final MaestroVariableRepository variableRepository;

    public MaestroVariableServiceImpl(MaestroVariableRepository variableRepository) {
        this.variableRepository = variableRepository;
    }

    @Override
    public ApiResponse obtenerCodigoMaestro(String codigoMaestro) {
        List<MaestroVariableDto>response= this.obtenerCodigosMaestro(codigoMaestro);
        return ApiResponse.builder()
                .codigo(HttpStatus.OK.value())
                .mensaje("OK")
                .data(response)
                .build();
    }

    @Override
    public ApiResponse  obtenerMaestroCalificacion(String codigoMaestro) {
        List<MaestroVariableDto> response= this.obtenerCodigosMaestro(codigoMaestro).stream()
                .filter(variableDto -> variableDto.getDetalleFiltro()
                        .equals("00") && variableDto.getFlagEstado()
                        .equals("H"))
                .sorted(Comparator.comparing(MaestroVariableDto::getDscDetalle))
                .toList();

        return ApiResponse.builder()
                .codigo(HttpStatus.OK.value())
                .mensaje("OK")
                .data(response)
                .build();
    }

    private List<MaestroVariableDto> obtenerCodigosMaestro(String codigoMaestro){
       List<MaestroVariableDto> response=  this.variableRepository.findByCodigoMaestroAndEstado(codigoMaestro, Constantes.ESTADO_ACTIVO)
                .stream()
                .map(m -> MaestroVariableMapper.mapToMaestroVariableDto(m)).toList();
        return response;
    }
}
