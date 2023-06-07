package org.prolis.pais.service.Impl;


import org.prolis.pais.entity.Pais;
import org.prolis.pais.repository.PaisRepository;
import org.prolis.pais.service.PaisService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;



@Service
@RequiredArgsConstructor

public class PaisServiceImpl implements PaisService {

    @Autowired
    private final PaisRepository paisRepository;
    @Override
    public Pais crearPais(Pais p) {
        return      paisRepository.save(p);
    }
    @Override
    public Pais listarPorIdPais(Long id) {

        Optional<Pais> optionalPais = paisRepository.findById(id);
        return optionalPais.orElse(null);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Pais> obtenerPaises() {
        return paisRepository.findAll();
    }

    @Override
    public Pais actualizarPais(Pais p) {
        Pais existe = paisRepository.findById(p.getIdPais()).get();
        existe.setDescripcion(p.getDescripcion());
        return paisRepository.save(existe);
    }


    @Override
    public boolean eliminarPais(Long id){
        boolean valor = paisRepository.existsById(id);
        if (valor){
           paisRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
}