package com.prolis.catmunicipio.service;


import com.prolis.catmunicipio.entity.catMunicipio;

import java.util.List;

public interface catMunicipioService {

    catMunicipio crearMunicipio(catMunicipio cm);
    catMunicipio listarMunPorId(Long id);
    List<catMunicipio> obtenerMunicipio();
    catMunicipio actualizarMunicipio(catMunicipio cm);
    void eliminarMunicipio(Long id);

}


