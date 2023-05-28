package com.prolis.valornormal.service.Impl;

import com.prolis.valornormal.entity.ValorNormal;
import com.prolis.valornormal.repository.ValorNormalRepository;
import com.prolis.valornormal.service.ValorNormalService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ValorNormalServiceImpl implements ValorNormalService {

    @Autowired
    private final ValorNormalRepository valorNormalRepository;

    @Override
    public ValorNormal crearValorNormal(ValorNormal v){
        return valorNormalRepository.save(v);
    }

    @Override
    public ValorNormal listarPorIdValor(Long id){
        Optional<ValorNormal> optionalValorNormal = valorNormalRepository.findById(id);
        return  optionalValorNormal.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ValorNormal> obtenerValor(){
        return valorNormalRepository.findAll();
    }

    @Override
    public ValorNormal actualizarValor(ValorNormal v){
        boolean exists = valorNormalRepository.existsById(v.getIdValoresNormales());
        if (exists){
            return valorNormalRepository.save(v);
        }else{
            v.setIdValoresNormales(null);
            return v;
        }

    }

    @Override
    public boolean eliminarValor(Long id){
        boolean valor = valorNormalRepository.existsById(id);
        if (valor){
            valorNormalRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }
}
