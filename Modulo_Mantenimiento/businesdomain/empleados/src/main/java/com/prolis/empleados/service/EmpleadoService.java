package com.prolis.empleados.service;

import com.prolis.empleados.entity.empleado;


import java.util.List;

public interface EmpleadoService {
    empleado listarPorId(Long id);
    List<empleado> obtenerEmpleados();
}
