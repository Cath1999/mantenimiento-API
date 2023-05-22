package com.prolis.catmunicipio.service.Impl;

import com.prolis.catmunicipio.Repository.catMunicipioRepository;
import com.prolis.catmunicipio.entity.catMunicipio;
import com.prolis.catmunicipio.service.catMunicipioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class catMunicipioServiceImpl implements catMunicipioService {

    @Autowired
    private final catMunicipioRepository catMunicipioRepository;
    @Override
    public catMunicipio crearMunicipio(catMunicipio p) {
        return catMunicipioRepository.save(p);
    }

    @Override
    public catMunicipio listarMunPorId(Long id) {
        Optional<catMunicipio> optionalCatMunicipio = catMunicipioRepository.findById(id);
        return optionalCatMunicipio.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<catMunicipio> obtenerMunicipio() {
        return catMunicipioRepository.findAll();
    }

    @Override
    public catMunicipio actualizarMunicipio(catMunicipio mn) {
        catMunicipio existe = catMunicipioRepository.findById(mn.getIdMunicipio()).get();
        existe.setIdDepartamento(mn.getIdDepartamento());
        existe.setDescripcion(mn.getDescripcion());
        return catMunicipioRepository.save(existe);
    }

    @Override
    public void eliminarMunicipio(Long id) {
       catMunicipioRepository.deleteById(id);
    }

}
