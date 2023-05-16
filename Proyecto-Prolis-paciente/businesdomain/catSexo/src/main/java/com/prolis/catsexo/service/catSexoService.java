package com.prolis.catsexo.service;

import com.prolis.catsexo.entity.catSexo;

import java.util.List;

public interface catSexoService {

    catSexo crearSx(catSexo cm);
    catSexo listarSxPorId(Long id);
    List<catSexo> obtenerSxPorId();
    catSexo actualizarSx(catSexo cm);
    void eliminarSx(Long id);

}
