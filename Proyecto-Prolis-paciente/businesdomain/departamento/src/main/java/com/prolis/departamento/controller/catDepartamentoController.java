package com.prolis.departamento.controller;

import com.prolis.departamento.entity.catDepartamento;
import com.prolis.departamento.service.catDepartamentoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
//@RequestMapping("api/catDepartamento)

public class catDepartamentoController {
    private catDepartamentoService dpt_Service;


    @PostMapping
    public ResponseEntity<catDepartamento> crearDpt(@RequestBody catDepartamento dpt) {
        catDepartamento dept = dpt_Service.crearDpt(dpt);
        return new ResponseEntity<>(dept, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<catDepartamento>> listarDpt(){
        List<catDepartamento> dpts = dpt_Service.obtenerDpt();
        return new ResponseEntity<>(dpts, HttpStatus.OK);
    }


    @GetMapping("id")
    public ResponseEntity<catDepartamento> obtenerDpt(@PathVariable("id") Long id) {
        catDepartamento dept = dpt_Service.listarDptPorId(id);
        return new ResponseEntity<>( dept, HttpStatus.OK);
    }

    @PutMapping("id")
    public ResponseEntity<catDepartamento> actualizarDpt(@PathVariable("id") Long id, @RequestBody catDepartamento input)
    {
        input.setIdDepartamento(id);
        catDepartamento dpts = dpt_Service.actualizarDpt(input);
        return new ResponseEntity<>(dpts, HttpStatus.OK);

    }

    @DeleteMapping("id")
    public ResponseEntity<String> eliminarDpt(@PathVariable("id")Long id)
    {
        dpt_Service.eliminarDpt(id);
        return new ResponseEntity<>("Departamento eliminado correctamente", HttpStatus.OK);
    }

}
