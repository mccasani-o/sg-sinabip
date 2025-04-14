package pe.gob.sbn.sinabip.core.maestro.service.impl;

import org.springframework.stereotype.Service;
import pe.gob.sbn.sinabip.common.constants.Constantes;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;
import pe.gob.sbn.sinabip.core.maestro.mapper.MaestroVariableMapper;
import pe.gob.sbn.sinabip.core.maestro.repository.MaestroVariableRepository;
import pe.gob.sbn.sinabip.core.maestro.service.inf.MaestroVariableService;

import java.util.List;

@Service
public class MaestroVariableServiceImpl implements MaestroVariableService {

    private final MaestroVariableRepository variableRepository;

    public MaestroVariableServiceImpl(MaestroVariableRepository variableRepository) {
        this.variableRepository = variableRepository;
    }

    @Override
    public List<MaestroVariableDto> obtenerCodigoMaestro(String codigoMaestro) {
        return this.obtenerCodigosMaestro(codigoMaestro);
    }

    @Override
    public List<MaestroVariableDto> obtenerMaestroCalificacion(String codigoMaestro) {
        return this.obtenerCodigosMaestro(codigoMaestro).stream()
                .filter(variableDto -> variableDto.getDetalleFiltro().strip()
                        .equals("00") && variableDto.getFlagEstado()
                        .equals("H")).toList();
    }



    private List<MaestroVariableDto> obtenerCodigosMaestro(String codigoMaestro){
        return this.variableRepository.findByCodigoMaestroAndEstado(codigoMaestro, Constantes.ESTADO_ACTIVO)
                .stream()
                .map(m -> MaestroVariableMapper.mapToMaestroVariableDto(m)).toList();
    }
}
