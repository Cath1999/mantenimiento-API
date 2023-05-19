package com.prolis.catsexo.service.Impl;


import com.prolis.catsexo.Repository.sexoRepository;
import com.prolis.catsexo.entity.catSexo;
import com.prolis.catsexo.service.catSexoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class sexoServiceImpl implements catSexoService {

    @Autowired
    private final sexoRepository pacienteRepository;
    @Override
    public catSexo crearSx(catSexo sx) {
        return sexoRepository.save(sx);
    }

    @Override
    public catSexo listarSxPorId(Long id) {
        Optional<catSexo> optionalCatSexo = sexoRepository.findById(id);
        return optionalCatSexo.get();
    }

    @Override
    @Transactional(readOnly = true)
    public List<catSexo> obtenerSxPorId() {
        return sexoRepository.findAll();
    }

    @Override
    public catSexo actualizarSx(catSexo sx) {
        catSexo existe = sexoRepository.findById(sx.getIdsexo()).get();
        /*existe.setCedula(p.getCedula());
        existe.setNombres(p.getNombres());
        existe.setApellidos(p.getApellidos());
        existe.setTelefono(p.getTelefono());
        existe.setDireccion(p.getDireccion());*/
        return sexoRepository.save(existe);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }
}
