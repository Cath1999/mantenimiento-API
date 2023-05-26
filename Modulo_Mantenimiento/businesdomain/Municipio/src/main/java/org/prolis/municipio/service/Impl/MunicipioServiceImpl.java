package org.prolis.municipio.service.Impl;


import lombok.RequiredArgsConstructor;
import org.prolis.municipio.entity.Municipio;
import org.prolis.municipio.repository.MunicipioRepository;
import org.prolis.municipio.service.MunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class MunicipioServiceImpl implements MunicipioService {

        @Autowired
        private final MunicipioRepository municipioRepository;


    @Override
    public Municipio crearMunicipio(Municipio mn) {
        if (mn.getIdMunicipio() != null) {
            throw new IllegalArgumentException("No se ha podido crear un nuevo municipio");
        }
        return municipioRepository.save(mn);
    }

        @Override
        public Municipio listarPorIdMunicipio(Long id) {
            Optional<Municipio> optionalMunicipio = municipioRepository.findById(id);
            return optionalMunicipio.orElse(null);
        }

    @Override
    @Transactional(readOnly = true)
    public List<Municipio> obtenerMunicipios() {
        return municipioRepository.findAll();
    }

    @Override
        public Municipio actualizarMunicipio(Municipio mn) {
            Municipio existe = municipioRepository.findById(mn.getIdMunicipio()).get();
            existe.setIdDepartamento(mn.getIdDepartamento());
            existe.setDescripcion(mn.getDescripcion());
            return municipioRepository.save(existe);
        }

        @Override
        public void eliminarMunicipio(Long id) {
            municipioRepository.deleteById(id);
        }

    }


