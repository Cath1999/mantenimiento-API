package org.prolis.paciente.service;

import org.prolis.paciente.entity.Paciente;

import java.util.List;

public interface PacienteService {


        Paciente crearPaciente(Paciente pc);
        Paciente listarPorIdPaciente(Long id);
        List<Paciente> obtenerPacientes();
        Paciente actualizarPaciente(Paciente pc);
        void eliminarPaciente(Long id);

    }

