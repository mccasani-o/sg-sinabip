package pe.gob.sbn.sinabip.core.maestro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Maestro_Variables")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaestroVariable {

    @Id
    @Column(name = "maestroID")
    private Long id;

    @Column(name = "cod_maestro")
    private String codigoMaestro;

    @Column(name = "dsc_maestro")
    private String dscMaestro;

    @Column(name = "det_maestro")
    private String detMaestro;

    @Column(name = "cod_detalle")
    private String codigoDetalle;

    @Column(name = "dsc_detalle")
    private String dscDetalle;

    @Column(name = "det_filtro")
    private String detalleFiltro;

    @Column(name = "det_detalle")
    private String detalle;

    @Column(name = "flg_estado")
    private String flagEstado;

    @Column(name = "fil_estado")
    private String estado;


}
