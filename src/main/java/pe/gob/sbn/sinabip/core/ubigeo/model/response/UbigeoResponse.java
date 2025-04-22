package pe.gob.sbn.sinabip.core.ubigeo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UbigeoResponse {
    private String Descripcion;
    private String codigoDepartamento;
    private String codigoProvincia;
    private String codigoDistrito;
    private String ubigeoCodigo;
}
