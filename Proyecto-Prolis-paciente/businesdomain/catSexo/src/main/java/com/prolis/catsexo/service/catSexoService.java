package com.prolis.catsexo.service;

import com.prolis.catsexo.entity.catSexo;

import java.util.List;

public interface catSexoService {

    catSexo crearSx(catSexo sx);
    catSexo listarSxPorId(Long id);
    List <catSexo> obtenerSxPorId();
    catSexo actualizarSx(catSexo sx);
    void eliminarSx(Long id);

}

