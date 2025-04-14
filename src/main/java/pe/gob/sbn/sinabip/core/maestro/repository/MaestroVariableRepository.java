package pe.gob.sbn.sinabip.core.maestro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.sbn.sinabip.core.maestro.dto.MaestroVariableDto;
import pe.gob.sbn.sinabip.core.maestro.entity.MaestroVariable;

import java.util.List;

public interface MaestroVariableRepository extends JpaRepository<MaestroVariable, Long> {
    List<MaestroVariable> findByCodigoMaestroAndEstado(String codigoMaestro, String estado);

}
