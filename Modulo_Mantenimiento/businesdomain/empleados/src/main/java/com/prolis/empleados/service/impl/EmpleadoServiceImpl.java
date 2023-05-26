package com.prolis.empleados.service.impl;

import com.prolis.empleados.entity.empleado;
import com.prolis.empleados.repository.EmpleadoRepository;
import com.prolis.empleados.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private final EmpleadoRepository empleadoRepository;

    @Override
    public empleado crearEmpleado(empleado e) {
        if (e.getIdEmpleado() != null) {
            throw new IllegalArgumentException("No se ha podido crear un nuevo empleado");
        }
        return empleadoRepository.save(e);
    }
    @Override
    public empleado listarPorIdEmpleado(Long id) {
        Optional<empleado> optionalResultados = empleadoRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public empleado actualizarEmpleado(empleado e) {
        empleado existe = empleadoRepository.findById(e.getIdEmpleado()).get();

        existe.setIdProfesiones(e.getIdProfesiones());
        existe.setPrimerNombre(e.getPrimerNombre());
        existe.setSegundoNombre(e.getSegundoNombre());
        existe.setPrimerApellido(e.getPrimerApellido());
        existe.setSegundoApellido(e.getSegundoApellido());
        return empleadoRepository.save(existe);
    }


    @Override
    public void eliminarEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }

}
