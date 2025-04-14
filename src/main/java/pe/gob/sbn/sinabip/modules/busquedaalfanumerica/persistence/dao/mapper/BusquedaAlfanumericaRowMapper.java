package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.mapper;

import org.springframework.jdbc.core.RowMapper;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BusquedaAlfanumericaRowMapper implements RowMapper<BusquedaAlfanumericaDto> {
    @Override
    public BusquedaAlfanumericaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        BusquedaAlfanumericaDto response = new BusquedaAlfanumericaDto();
        response.setItem(rs.getString("ROW_NUMBER_ID"));
        response.setCodigoInterno(rs.getString("CODIGO_INTERNO"));
        response.setNumeroSinabip(rs.getString("NRO_RSINABIP"));
        response.setCodigoLibro(rs.getString("CODIGO_LIBRO"));
        response.setNumeroAciente(rs.getString("NRO_ASIENTO"));
        response.setEstadoAciento(rs.getString("ESTADO_ASIENTO"));
        response.setEstadoDetalle(rs.getString("ESTADO_DETALLE"));
        response.setEstadoCalificacion(rs.getString("ESTADO_CALIFICACION"));
        response.setDenominacionInmueble(rs.getString("DENOMINACION_INMUEBLE"));
        response.setNmbEntidad(rs.getString("NMB_ENTE"));
        response.setDepartamento(rs.getString("DEPARTAMENTO"));
        response.setNombreDepartamento(rs.getString("NOMBRE_DEPARTAMENTO"));
        response.setProvincia(rs.getString("PROVINCIA"));
        response.setNombreProvincia(rs.getString("NOMBRE_PROVINCIA"));
        response.setDestrito(rs.getString("DISTRITO"));
        response.setNombreDistrito(rs.getString("NOMBRE_DISTRITO"));
        response.setDireccionInmueble(rs.getString("DIRECCION_INMUEBLE"));
        response.setAreaRegistral(rs.getString("AREA_REGISTRAL"));
        response.setCodigoPredio(rs.getString("CODIGO_PREDIO"));
        response.setPartidaElectronica(rs.getString("PARTIDA_ELECTRONICA"));
        response.setFicha(rs.getString("FICHA"));
        response.setTomo(rs.getString("TOMO"));
        response.setCodigoPartida(rs.getString("CODIGO_PARTIDA"));
        response.setNroPartidaRegistral(rs.getString("NRO_PARTIDA_REGISTRAL"));
        response.setTipoAsiento(rs.getString("TIPO_ASIENTO"));
        response.setCondicion(rs.getString("CONDICION"));
        return response;
    }
}
