package com.prolis.catsexo.controller;

import com.prolis.catsexo.entity.catSexo;
import com.prolis.catsexo.service.catSexoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class catSexoController {


    private catSexoService sx_service;

    @PostMapping
    public ResponseEntity<catSexo> crearSx(@RequestBody catSexo s)
    {
        catSexo sx = sx_service.crearSx(s);
        return new ResponseEntity<>(sx, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<catSexo>> listarSxPorId(){
        List<catSexo> sxs = sx_service.obtenerSxPorId();
        return new ResponseEntity<>(sxs, HttpStatus.OK);
    }

    // http://localhost:8080/api/pacientes/1
    @GetMapping("{id}")
    public ResponseEntity<catSexo> obtenerSxPorId(@PathVariable("id") Long id)
    {
        catSexo sx = sx_service.listarSxPorId(id);
        return new ResponseEntity<>(sx, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<catSexo> actualizarSx(@PathVariable("id") Long id, @RequestBody catSexo input)
    {
        input.setIdsexo(id);
        catSexo px = sx_service.actualizarSx(input);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminarPx(@PathVariable("id") Long id)
    {
        sx_service.eliminarSx(id);
        return new ResponseEntity<>("Sexo eliminado correctamente!!", HttpStatus.OK);
    }


}
