package com.prolis.empleados.service;

import com.prolis.empleados.entity.empleado;


import java.util.List;

public interface EmpleadoService {

    empleado crearEmpleado(empleado e);
    empleado listarPorIdEmpleado(Long id);
    List<empleado> obtenerEmpleados();
    empleado actualizarEmpleado(empleado e);
    boolean eliminarEmpleado(Long id);

}
