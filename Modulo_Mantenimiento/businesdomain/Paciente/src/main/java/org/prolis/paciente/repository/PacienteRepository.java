package org.prolis.paciente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.prolis.paciente.entity.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
