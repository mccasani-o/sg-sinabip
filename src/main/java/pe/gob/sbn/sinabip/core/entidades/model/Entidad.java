package pe.gob.sbn.sinabip.core.entidades.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ente")
public class Entidad {

    @Id
    @Column(name = "codigo_ente")
    private String codigoEnteidad;

    @Column(name = "Codigo")
    private String ruc;
}
