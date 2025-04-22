package pe.gob.sbn.sinabip.modules.busquedaalfanumerica.model.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusquedaAlfanumericaRequest {

    @Size(max = 11, message = "El RUC debe tener como máximo 11 caracteres")
    private String rucEntidad;
    private String cus;
    private String codigoDepartamento;
    private String codigoProvincia;
    private String codigoDistrito;
    private String direccion;
    private String propietario;
    private String areaMinima;
    private String areaMaxima;
    private String tipoPartida;
    private String numeroPartida;
    private String numeroSolictudIngreso;
    private String ocurrencia;
    private String pagina;
    private String numeroPagina;
}
