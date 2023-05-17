package com.prolis.empleado.Repository;

import com.prolis.empleado.entity.empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<empleado, Long> {
}
