package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.impl;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.dto.BusquedaAlfanumericaDto;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request.BusquedaAlfanumericaRequest;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.inf.BusquedaAlfanumericaDao;
import pe.gob.sbn.sinabip.modules.busquedaalfanumerica.persistence.dao.mapper.BusquedaAlfanumericaRowMapper;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class BusquedaAlfanumericaDaoImpl implements BusquedaAlfanumericaDao {

    private final SimpleJdbcCall jdbcCall;

    public BusquedaAlfanumericaDaoImpl(DataSource dataSource) {
        this.jdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("SP_SINABIP_BUSQUEDA_AVANZADA_PREDIOS")
                .returningResultSet("result", new BusquedaAlfanumericaRowMapper());
    }


    @Override
    public List<BusquedaAlfanumericaDto> obtenerBusquedaPredios(BusquedaAlfanumericaRequest request) {

        SqlParameterSource sqlParameter = new MapSqlParameterSource()
                .addValue("RUC_ENTIDAD", request.getRucEntidad())
                .addValue("DENOMINACION_CUS", request.getCus())
                .addValue("COD_DEPARTAMENTO", request.getCodigoDepartamento())
                .addValue("COD_PROVINCIA", request.getCodigoProvincia())
                .addValue("COD_DISTRITO", request.getCodigoDistrito())
                .addValue("DIRECCION", request.getDireccion())
                .addValue("PROPIETARIO", request.getPropietario())
                .addValue("AREA_MINIMA", request.getAreaMinima())
                .addValue("AREA_MAXIMA", request.getAreaMaxima())
                .addValue("TIPO_PARTIDA", request.getTipoPartida())
                .addValue("NRO_PARTIDA", request.getNumeroPartida())
                .addValue("NRO_SI", request.getNumeroSolictudIngreso())
                .addValue("OCURRENCIA", request.getOcurrencia())
                .addValue("PAGE", request.getPagina())
                .addValue("RECORDS", request.getNumeroGagina());

        Map<String, Object> result = jdbcCall.execute(sqlParameter);
        System.out.println("###############: "+ result);
        return (List<BusquedaAlfanumericaDto>) result.get("result");
    }
}
