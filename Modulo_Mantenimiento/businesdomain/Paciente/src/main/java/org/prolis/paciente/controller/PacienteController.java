package org.prolis.paciente.controller;


import lombok.AllArgsConstructor;
import org.prolis.paciente.entity.Paciente;
import org.prolis.paciente.service.PacienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/pacientes")

public class PacienteController {


    private PacienteService pacienteService;

    // http://localhost:8081/api/pacientes

    @PostMapping(path="/add")
    public ResponseEntity<Paciente> crearPaciente(@RequestBody Paciente pc) {
        Paciente paciente = pacienteService.crearPaciente(pc);
        return new ResponseEntity<>(paciente, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Paciente>> listarPacientes(){
        List<Paciente> pacientes = pacienteService.obtenerPacientes();
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    @GetMapping(path="/getById/{id}")
    public ResponseEntity<Paciente> listarPorIdPaciente(@PathVariable("id") Long id) {
        Paciente pc = pacienteService.listarPorIdPaciente(id);
        return new ResponseEntity<>(pc, HttpStatus.OK);
    }

    @PutMapping(path="/updateById/{id}")
    public ResponseEntity<Paciente> actualizarPaciente(@PathVariable("id") Long id, @RequestBody Paciente input)
    {
        input.setIdPaciente(id);
        Paciente pc = pacienteService.actualizarPaciente(input);
        return new ResponseEntity<>(pc, HttpStatus.OK);

    }

    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<String> eliminarPaciente(@PathVariable("id")Long id)
    {
        pacienteService.eliminarPaciente(id);
        return new ResponseEntity<>("Paciente eliminado correctamente", HttpStatus.OK);
    }

}

