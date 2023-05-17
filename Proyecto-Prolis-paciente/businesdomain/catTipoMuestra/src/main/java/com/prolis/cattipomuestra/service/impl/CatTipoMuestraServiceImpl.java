package com.prolis.cattipomuestra.service.impl;

import com.prolis.cattipomuestra.entity.CatTipoMuestra;

import com.prolis.cattipomuestra.repository.CatTipoMuestraRepository;
import com.prolis.cattipomuestra.service.CatTipoMuestraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor


public class CatTipoMuestraServiceImpl implements CatTipoMuestraService {

    @Autowired
    private final CatTipoMuestraRepository cattipomuestraRepository;

    @Override
    public CatTipoMuestra crearTipoMuestra(CatTipoMuestra p) {
        return cattipomuestraRepository.save(p);
    }

    @Override
    public CatTipoMuestra listarPorId(Long id) {
        Optional<CatTipoMuestra> optionalCatTipoMuestra = cattipomuestraRepository.findById(id);
        return optionalCatTipoMuestra.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<CatTipoMuestra> obtenerCatTipoMuestra() {
        return cattipomuestraRepository.findAll();
    }

    @Override
    public CatTipoMuestra actualizarCatTipoMuestra(CatTipoMuestra p) {
        CatTipoMuestra existe = cattipomuestraRepository.findById(p.getIdTipoMuestra()).get();
        /*existe.setCedula(p.getCedula());
        existe.setNombres(p.getNombres());
        existe.setApellidos(p.getApellidos());
        existe.setTelefono(p.getTelefono());
        existe.setDireccion(p.getDireccion());*/
        return cattipomuestraRepository.save(existe);
    }

    @Override
    public void eliminarCatTipoMuestra(Long id) {
        cattipomuestraRepository.deleteById(id);
    }
}
