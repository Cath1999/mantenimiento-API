package com.prolis.examen.service.Impl;

import com.prolis.examen.entity.Examen;
import com.prolis.examen.repository.ExamenRepository;
import com.prolis.examen.service.ExamenService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private final ExamenRepository examenRepository;

    @Override
    public Examen crearExamen(Examen e){
        return examenRepository.save(e);
    }

    @Override
    public Examen listarPorIdExamen(Long id){
        Optional<Examen> optionalExamen = examenRepository.findById(id);
        return  optionalExamen.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Examen> obtenerExamenes(){
        return examenRepository.findAll();
    }

    @Override
    public Examen actualizarExamen(Examen e){
        return examenRepository.save(e);
    }

    @Override
    public boolean eliminarExamen(Long id){
        boolean examen = examenRepository.existsById(id);
        if (examen){
            examenRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

}
