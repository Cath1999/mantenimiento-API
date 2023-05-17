package com.prolis.empleado.service;

import com.prolis.empleado.entity.empleado;

import java.util.List;

public interface EmpleadoService {
    Empleado crearEmpleado(Empleado E);
    Empleado listarPorId(Long id);
    List<Empleado> obtenerEmpleado();
    Empleado actualizarEmpleado(Empleado E);
    void eliminarEmpleado(Long id);
}
