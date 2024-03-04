package co.uco.observaciones.repository;

import co.uco.observaciones.domain.observacion.Observacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObservacionRepository extends JpaRepository<Observacion, Long> {

}