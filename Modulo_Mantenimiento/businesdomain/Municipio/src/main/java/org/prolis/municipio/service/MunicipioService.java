package org.prolis.municipio.service;

import org.prolis.municipio.entity.Municipio;

import java.util.List;

public interface MunicipioService {


        Municipio crearMunicipio(Municipio mn);
        Municipio listarPorIdMunicipio(Long id);
        List<Municipio> obtenerMunicipios();
        Municipio actualizarMunicipio(Municipio mn);
        void eliminarMunicipio(Long id);

    }

