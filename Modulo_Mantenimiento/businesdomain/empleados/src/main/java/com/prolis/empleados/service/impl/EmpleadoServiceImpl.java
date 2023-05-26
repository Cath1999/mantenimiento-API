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

    /*Solo de ejemplos*/
    @Override
    public empleado listarPorId(Long id) {
        Optional<empleado> optionalResultados = empleadoRepository.findById(id);
        return optionalResultados.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<empleado> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

}
