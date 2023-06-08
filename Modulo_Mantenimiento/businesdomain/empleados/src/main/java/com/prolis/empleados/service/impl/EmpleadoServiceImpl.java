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
        boolean exists = empleadoRepository.existsById(e.getIdEmpleado());
        if (exists){
            return empleadoRepository.save(e);
        }else{
            e.setIdEmpleado(null);
            return e;
        }
    }


    @Override
    public boolean eliminarEmpleado(Long id){
    boolean valor = empleadoRepository.existsById(id);
        if (valor){
        empleadoRepository.deleteById(id);
        return true;
    }else{
        return false;
    }
}
}
