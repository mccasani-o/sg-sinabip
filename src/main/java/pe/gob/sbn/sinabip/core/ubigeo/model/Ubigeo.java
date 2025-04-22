package pe.gob.sbn.sinabip.core.ubigeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ubigeo {
    private String Descripcion;
    private String codigoDepartamento;
    private String codigoProvincia;
    private String codigoDistrito;
    private String ubigeoCodigo;
}
