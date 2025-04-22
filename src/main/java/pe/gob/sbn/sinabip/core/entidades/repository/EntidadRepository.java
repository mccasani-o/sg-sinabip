package pe.gob.sbn.sinabip.core.entidades.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.sbn.sinabip.core.entidades.model.Entidad;

public interface EntidadRepository extends JpaRepository<Entidad, String> {
    boolean existsByRuc(String ruc);
}
