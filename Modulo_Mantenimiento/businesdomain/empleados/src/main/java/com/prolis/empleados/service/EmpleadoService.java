package com.prolis.empleados.service;

import com.prolis.empleados.entity.empleado;


import java.util.List;

public interface EmpleadoService {

    empleado crearEmpleado(empleado e);
    empleado listarPorId(Long id);
    List<empleado> obtenerEmpleados();
    empleado actualizarEmpleado(empleado e);
    void eliminarEmpleado(Long id);

}
