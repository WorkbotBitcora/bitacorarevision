package co.uco.observaciones.repository;

import co.uco.observaciones.domain.bitacora.Bitacora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BitacoraRepository extends JpaRepository<Bitacora, Long> {

}