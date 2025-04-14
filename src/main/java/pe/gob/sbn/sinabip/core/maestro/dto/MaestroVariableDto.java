package pe.gob.sbn.sinabip.core.maestro.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class MaestroVariableDto {

    private String codigoMaestro;
    private String dscMaestro;
    private String detMaestro;
    private String codigoDetalle;
    private String dscDetalle;
    private String detalleFiltro;
    private String detalle;
    private String flagEstado;
    private String estado;



}
