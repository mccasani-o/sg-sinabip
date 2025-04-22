package pe.gob.sbn.sinabip.core.ubigeo.model.resquest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UbigeoRequest {

    private String codigoDepartamento;
    private String codigoProvincia;
    private String codigoDistrito;
    private int tipo;
}
