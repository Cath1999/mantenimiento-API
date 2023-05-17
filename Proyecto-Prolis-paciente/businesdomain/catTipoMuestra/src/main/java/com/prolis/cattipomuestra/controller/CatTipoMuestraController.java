package com.prolis.cattipomuestra.controller;

import com.prolis.cattipomuestra.entity.CatTipoMuestra;
import com.prolis.cattipomuestra.service.CatTipoMuestraService;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/tipomuestra")
public class CatTipoMuestraController {

    private CatTipoMuestraService px_service;

    @PostMapping
    public ResponseEntity<CatTipoMuestra> crearTipoMuestra(@RequestBody CatTipoMuestra p)
    {
        CatTipoMuestra px = px_service.crearTipoMuestra(p);
        return new ResponseEntity<>(px, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/pacientes
    @GetMapping
    public ResponseEntity<List<CatTipoMuestra>> listarCatTipoMuestra(){
        List<CatTipoMuestra> pxs = px_service.obtenerCatTipoMuestra();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }

    // http://localhost:8080/api/pacientes/1
    @GetMapping("{id}")
    public ResponseEntity<CatTipoMuestra> obtenerPxPorId(@PathVariable("id") Long id)
    {
        CatTipoMuestra px = px_service.listarPorId(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<CatTipoMuestra> actualizarPx(@PathVariable("id") Long id, @RequestBody CatTipoMuestra input)
    {
        input.setIdTipoMuestra(id);
        CatTipoMuestra px = px_service.actualizarCatTipoMuestra(input);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> eliminarPx(@PathVariable("id") Long id)
    {
        px_service.eliminarCatTipoMuestra(id);
        return new ResponseEntity<>("Tipo de muestra eliminado correctamente!!", HttpStatus.OK);
    }
}
