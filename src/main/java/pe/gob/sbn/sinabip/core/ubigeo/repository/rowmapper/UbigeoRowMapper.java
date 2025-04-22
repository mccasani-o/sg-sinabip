package pe.gob.sbn.sinabip.core.ubigeo.repository.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import pe.gob.sbn.sinabip.core.ubigeo.model.Ubigeo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UbigeoRowMapper implements RowMapper<Ubigeo> {

    @Override
    public Ubigeo mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ubigeo ubigeo = new Ubigeo();
        ubigeo.setDescripcion(rs.getString("Ubi_Descripcion"));
        ubigeo.setUbigeoCodigo(rs.getString("Ubi_Cod"));
        ubigeo.setCodigoDepartamento(rs.getString("Ubi_CodDepartamento"));
        ubigeo.setCodigoProvincia(rs.getString("Ubi_CodProvincia"));
        ubigeo.setCodigoDistrito(rs.getString("Ubi_CodDistrito"));
        return ubigeo;
    }
}
