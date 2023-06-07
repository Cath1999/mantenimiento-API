package org.prolis.pais.service;


import org.prolis.pais.entity.Pais;

import java.util.List;

public interface PaisService {

    Pais crearPais(Pais p);
    Pais listarPorIdPais(Long id);
    List<Pais> obtenerPaises();
    Pais actualizarPais(Pais p);
    boolean  eliminarPais(Long id);
}
