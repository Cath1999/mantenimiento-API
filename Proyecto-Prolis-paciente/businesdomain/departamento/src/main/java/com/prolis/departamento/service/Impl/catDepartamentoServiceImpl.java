package com.prolis.departamento.service.Impl;

import com.prolis.departamento.Repository.catDepartamentoRepository;
import com.prolis.departamento.entity.catDepartamento;
import com.prolis.departamento.service.catDepartamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class catDepartamentoServiceImpl implements catDepartamentoService {


    @Autowired
    private final catDepartamentoRepository catDepartamentoRepository;
    @Override
    public catDepartamento crearDpt(catDepartamento cd) {
        return catDepartamentoRepository.save(cd);
    }

    @Override
    public catDepartamento listarDpt(Long id) {
        Optional<catDepartamento> optionalCatDepartamento = catDepartamentoRepository.findById(id);
        return optionalCatDepartamento.get();
    }


    @Override
    @Transactional(readOnly = true)
    public List<catDepartamento> obtenerDpt() {
        return catDepartamentoRepository.findAll();
    }

    @Override
    public catDepartamento actualizarDpt(catDepartamento p) {
        catDepartamento existe = catDepartamentoRepository.findById(p.getIdDepartamento()).get();
        /*existe.setCedula(p.getCedula());
        existe.setNombres(p.getNombres());
        existe.setApellidos(p.getApellidos());
        existe.setTelefono(p.getTelefono());
        existe.setDireccion(p.getDireccion());*/
        return catDepartamentoRepository.save(existe);
    }

    @Override
    public void eliminarDpt(Long id) {
        catDepartamentoRepository.deleteById(id);
    }




}
