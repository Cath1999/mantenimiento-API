package com.prolis.empleados.repository;

import com.prolis.empleados.entity.empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<empleado, Long> {
}
