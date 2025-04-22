package pe.gob.sbn.sinabip.core.maestro.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaestroVariableDto {

    @JsonIgnore
    private String codigoMaestro;
    @JsonIgnore
    private String dscMaestro;
    @JsonIgnore
    private String detMaestro;
    private String codigoDetalle;
    private String dscDetalle;
    @JsonIgnore
    private String detalleFiltro;
    @JsonIgnore
    private String detalle;
    @JsonIgnore
    private String flagEstado;
    @JsonIgnore
    private String estado;



}
