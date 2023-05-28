package com.prolis.tipomuestra.service.Impl;

import com.prolis.tipomuestra.entity.TipoMuestra;
import com.prolis.tipomuestra.repository.TipoMuestraRepository;
import com.prolis.tipomuestra.service.TipoMuestraService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TipoMuestraServiceImpl implements TipoMuestraService {

    @Autowired
    private final TipoMuestraRepository tipoMuestraRepository;

    @Override
    public TipoMuestra crearTipoMuestra(TipoMuestra m){
        return tipoMuestraRepository.save(m);
    }

    @Override
    public TipoMuestra listarPorIdMuestra(Long id){
        Optional<TipoMuestra> optionalTipoMuestra = tipoMuestraRepository.findById(id);
        return optionalTipoMuestra.orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoMuestra> obtenerMuestras() {
        return tipoMuestraRepository.findAll();
    }

    @Override
    public TipoMuestra actualizarMuestra(TipoMuestra m){
        return tipoMuestraRepository.save(m);
    }

    @Override
    public boolean eliminarMuestra(Long id){
        boolean optionalTipoMuestra = tipoMuestraRepository.existsById(id);
        if (optionalTipoMuestra){
            tipoMuestraRepository.deleteById(id);
            return true;
        } else{
            return false;
        }


    }


}
