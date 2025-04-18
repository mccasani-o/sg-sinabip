package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.mapper;

import org.springframework.beans.BeanUtils;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.response.BusquedaAlfanumericaResponse;

public class BusquedaAlfanumericaMapper {
    private BusquedaAlfanumericaMapper(){}

    public static BusquedaAlfanumericaResponse mapToBusquedaAlfanumericaResponse(BusquedaAlfanumericaDto busquedaAlfanumericaDto) {
        BusquedaAlfanumericaResponse response = new BusquedaAlfanumericaResponse();
        BeanUtils.copyProperties(busquedaAlfanumericaDto, response);
        return response;
    }
}
