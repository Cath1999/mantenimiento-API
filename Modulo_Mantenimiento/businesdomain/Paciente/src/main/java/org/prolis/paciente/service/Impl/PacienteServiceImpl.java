package org.prolis.paciente.service.Impl;


import lombok.RequiredArgsConstructor;
import org.prolis.paciente.entity.Paciente;
import org.prolis.paciente.repository.PacienteRepository;
import org.prolis.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private final PacienteRepository pacienteRepository;


    @Override
    public Paciente crearPaciente(Paciente pc) {

        return pacienteRepository.save(pc);
    }

    @Override
    public Paciente listarPorIdPaciente(Long id) {
        Optional<Paciente> optionalPaciente = pacienteRepository.findById(id);
        return optionalPaciente.orElse(null);
    }



    @Override
    @Transactional(readOnly = true)
    public List<Paciente> obtenerPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Paciente actualizarPaciente(Paciente pc) {
        //Paciente existe = pacienteRepository.findById(pc.getIdPaciente()).get();
        //existe.setIdIdentificacion(pc.getIdIdentificacion());
        return pacienteRepository.save(pc);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

}


