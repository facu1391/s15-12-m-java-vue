package com.nc.Propiedades360.resources.Propietario.Repository;

import com.nc.Propiedades360.resources.Propietario.Entity.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long> {
}
