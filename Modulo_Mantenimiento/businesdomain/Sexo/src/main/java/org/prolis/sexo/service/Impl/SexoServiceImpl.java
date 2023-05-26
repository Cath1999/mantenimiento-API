package org.prolis.sexo.service.Impl;


import org.prolis.sexo.entity.Sexo;
import org.prolis.sexo.repository.SexoRepository;
import org.prolis.sexo.service.SexoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SexoServiceImpl implements SexoService {

    @Autowired
    private final SexoRepository sexoRepository;
    @Override
    public Sexo crearSexo(Sexo s) {
        if (s.getIdSexo() != null) {
            throw new IllegalArgumentException("No se ha podido crear un nuevo sexo");
        }
        return sexoRepository.save(s);
    }
    @Override
    public Sexo listarPorIdSexo(Long id) {

        Optional<Sexo> optionalPais = sexoRepository.findById(id);
        return optionalPais.orElse(null);

    }

    @Override
    @Transactional(readOnly = true)
    public List<Sexo> obtenerSexos() {
        return sexoRepository.findAll();
    }

    @Override
    public Sexo actualizarSexo(Sexo s) {
        Sexo existe = sexoRepository.findById(s.getIdSexo()).get();
        existe.setDescripcion(s.getDescripcion());
        return sexoRepository.save(existe);
    }




    @Override
    public void eliminarSexo(Long id) {
        sexoRepository.deleteById(id);
    }

}

