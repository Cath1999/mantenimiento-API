package org.prolis.departamento.service.Impl;

import lombok.RequiredArgsConstructor;

import org.prolis.departamento.repository.DepartamentoRepository;
import org.prolis.departamento.service.DepartamentoService;
import org.prolis.departamento.entity.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class DepartamentoServiceImpl implements DepartamentoService {

    @Autowired
    private final DepartamentoRepository departamentoRepository;


    @Override
    public Departamento crearDepartamento(Departamento dt) {
        return departamentoRepository.save(dt);
    }

    @Override
    public Departamento listarPorIdDepartamento(Long id) {
        Optional<Departamento> optionalDepartamento = departamentoRepository.findById(id);
        return optionalDepartamento.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Departamento> obtenerDepartamentos() {
        return departamentoRepository.findAll();
    }

    @Override
    public Departamento actualizarDepartamento(Departamento dt) {
        //Departamento existe = departamentoRepository.findById(pc.getIdDepartamento()).get();
        //existe.setIdPais(pc.getIdPais());
        return departamentoRepository.save(dt);
    }

    @Override
    public void eliminarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }

}
