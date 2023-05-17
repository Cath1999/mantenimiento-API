package com.prolis.empleado.Service;

import com.prolis.empleado.entity.empleado;

import java.util.List;

public interface EmpleadoService {
    empleado crearEmpleado(empleado E);
    empleado listarPorId(Long id);
    List<empleado> obtenerEmpleado();
    empleado actualizarEmpleado(empleado E);
    void eliminarEmpleado(Long id);
}
