package com.prolis.empleados.controller;

import com.prolis.empleados.entity.empleado;
import com.prolis.empleados.service.EmpleadoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/empleado")
public class EmpleadoController {
    private EmpleadoService px_service;

    // http://localhost:8082/api/empleado
    @GetMapping
    public ResponseEntity<List<empleado>> listarExamenes(){
        List<empleado> pxs = px_service.obtenerEmpleados();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    //localhost:8082/api/empleado/empleadoById/{id}
    @GetMapping(path="/empleadoById/{id}")
    public ResponseEntity<empleado> obtenerPxPorId(@PathVariable("id") Long id)
    {
        empleado px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }
}
