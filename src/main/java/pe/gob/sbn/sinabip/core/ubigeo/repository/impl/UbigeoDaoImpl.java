package pe.gob.sbn.sinabip.core.ubigeo.repository.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import pe.gob.sbn.sinabip.core.ubigeo.model.Ubigeo;
import pe.gob.sbn.sinabip.core.ubigeo.model.resquest.UbigeoRequest;
import pe.gob.sbn.sinabip.core.ubigeo.repository.inf.UbigeoDaoInf;
import pe.gob.sbn.sinabip.core.ubigeo.repository.rowmapper.UbigeoRowMapper;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Slf4j
@Repository
public class UbigeoDaoImpl implements UbigeoDaoInf {

    private SimpleJdbcCall simpleJdbcCall;

    public UbigeoDaoImpl(DataSource dataSource) {
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withProcedureName("SP_UBIGEO")
                .returningResultSet("result", new UbigeoRowMapper());
    }

    @Override
    public List<Ubigeo> obtenerObigeo(UbigeoRequest request) {
        SqlParameterSource sqlParameter = new MapSqlParameterSource()
                .addValue("coddepa", request.getCodigoDepartamento())
                .addValue("codprov", request.getCodigoProvincia())
                .addValue("coddist", request.getCodigoDistrito())
                .addValue("tipo", request.getTipo());

        Map<String, Object> result = simpleJdbcCall.execute(sqlParameter);
        log.info("result : {}", result);
        return (List<Ubigeo>) result.get("result");
    }
}
