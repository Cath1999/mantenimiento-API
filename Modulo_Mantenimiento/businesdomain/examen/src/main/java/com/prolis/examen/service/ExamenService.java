package com.prolis.examen.service;

import com.prolis.examen.entity.Examen;

import java.util.List;

public interface ExamenService {

    Examen crearExamen(Examen e);
    Examen listarPorIdExamen(Long id);
    List<Examen> obtenerExamenes();
    Examen actualizarExamen(Examen e);
    boolean eliminarExamen(Long id);
}
