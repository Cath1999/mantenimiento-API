package org.prolis.departamento.service;

import org.prolis.departamento.entity.Departamento;

import java.util.List;

public interface DepartamentoService {


        Departamento crearDepartamento(Departamento dt);
        Departamento listarPorIdDepartamento(Long id);
        List<Departamento> obtenerDepartamentos();
        Departamento actualizarDepartamento(Departamento dt);
        void eliminarDepartamento(Long id);

}
