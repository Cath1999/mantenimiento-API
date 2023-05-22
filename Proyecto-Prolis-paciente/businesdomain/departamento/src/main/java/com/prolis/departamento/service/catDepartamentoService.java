package com.prolis.departamento.service;

import com.prolis.departamento.entity.catDepartamento;

import java.util.List;

public interface catDepartamentoService {

    catDepartamento crearDpt(catDepartamento dpt);

    catDepartamento listarDpt(Long id);
    List<catDepartamento> obtenerDpt();
    catDepartamento actualizarDpt(catDepartamento p);
    void eliminarDpt(Long id);


}
