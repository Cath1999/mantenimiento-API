package org.prolis.sexo.service;

import org.prolis.sexo.entity.Sexo;

import java.util.List;

public interface SexoService {

    Sexo crearSexo(Sexo s);
    Sexo listarPorIdSexo(Long id);
    List<Sexo> obtenerSexos();
    Sexo actualizarSexo(Sexo p);
    void eliminarSexo(Long id);


}
