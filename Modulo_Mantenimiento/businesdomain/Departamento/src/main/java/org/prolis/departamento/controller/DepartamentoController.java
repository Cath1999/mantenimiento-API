package org.prolis.departamento.controller;

import lombok.AllArgsConstructor;
import org.prolis.departamento.entity.Departamento;
import org.prolis.departamento.service.DepartamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/departamentos")

public class DepartamentoController {


    private DepartamentoService departamentoService;

    // http://localhost:8081/api/departamentos

    @PostMapping(path="/add")
    public ResponseEntity<Departamento> crearDepartamento(@RequestBody Departamento dt) {
        Departamento departamento = departamentoService.crearDepartamento(dt);
        return new ResponseEntity<>(departamento, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamentos(){
        List<Departamento> departamento = departamentoService.obtenerDepartamentos();
        return new ResponseEntity<>(departamento, HttpStatus.OK);
    }

    @GetMapping(path="/getById/{id}")
    public ResponseEntity<Departamento> listarPorIdDepartamento(@PathVariable("id") Long id) {
        Departamento dt = departamentoService.listarPorIdDepartamento(id);
        return new ResponseEntity<>(dt, HttpStatus.OK);
    }

    @PutMapping(path="/updateById/{id}")
    public ResponseEntity<Departamento> actualizarDepartamento(@PathVariable("id") Long id, @RequestBody Departamento input)
    {
        input.setIdDepartamento(id);
        Departamento dt = departamentoService.actualizarDepartamento(input);
        return new ResponseEntity<>(dt, HttpStatus.OK);

    }

    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<String> eliminarDepartamento(@PathVariable("id")Long id)
    {
        departamentoService.eliminarDepartamento(id);
        return new ResponseEntity<>("Departamento eliminado correctamente", HttpStatus.OK);
    }

}