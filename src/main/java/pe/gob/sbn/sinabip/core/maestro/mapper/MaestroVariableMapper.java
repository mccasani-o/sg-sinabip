package pe.gob.sbn.sinabip.core.maestro.mapper;

import org.springframework.beans.BeanUtils;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;
import pe.gob.sbn.sinabip.core.maestro.entity.MaestroVariable;

public class MaestroVariableMapper {
    private MaestroVariableMapper() {
    }

    public static MaestroVariableDto mapToMaestroVariableDto(MaestroVariable maestroVariable) {
        MaestroVariableDto variableDto =  MaestroVariableDto.builder().build();

        BeanUtils.copyProperties(maestroVariable, variableDto);
        return variableDto;
    }


}
