package com.prolis.empleado.controller;

import com.prolis.empleado.entity.empleado;
import com.prolis.empleado.Service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/empleado")
public class EmpleadoController {

    private EmpleadoService Em_service;

    @PostMapping
    public ResponseEntity<empleado> crearEmpleado(@RequestBody empleado E)
    {
        empleado Em = Em_service.crearEmpleado(E);
        return new ResponseEntity<>(Em, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/empleado
    @GetMapping
    public ResponseEntity<List<empleado>> listarEmpleado(){
        List<empleado> Emp = Em_service.obtenerEmpleado();
        return new ResponseEntity<>(Emp, HttpStatus.OK);
    }

    // http://localhost:8080/api/empleado/1
    @GetMapping("{id}")
    public ResponseEntity<empleado> obtenerEmPorId(@PathVariable("id") Long id)
    {
        empleado Em = Em_service.listarPorId(id);
        return new ResponseEntity<>(Em, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<empleado> actualizarEm(@PathVariable("id") Long id, @RequestBody empleado input)
    {
        input.setIdEmpleado(id);
        empleado Em = Em_service.actualizarEmpleado(input);
        return new ResponseEntity<>(Em, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminarEm(@PathVariable("id") Long id)
    {
        Em_service.eliminarEmpleado(id);
        return new ResponseEntity<>("El empleado fue eliminado correctamente", HttpStatus.OK);
    }
}
