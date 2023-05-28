package com.prolis.valornormal.controller;

import com.prolis.valornormal.entity.ValorNormal;
import com.prolis.valornormal.service.ValorNormalService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/valores")
public class ValorNormalController {

    private ValorNormalService valorNormalService;

    @PostMapping(path="/add")
    public ResponseEntity<ValorNormal> crearValor(@RequestBody ValorNormal v){
        ValorNormal valor = valorNormalService.crearValorNormal(v);
        return new ResponseEntity<>(valor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ValorNormal>> listarValores(){
        List<ValorNormal> valores = valorNormalService.obtenerValor();
        return new ResponseEntity<>(valores, HttpStatus.OK);
    }

    @GetMapping(path="/getById/{id}")
    public ResponseEntity<ValorNormal> listarPorIdValor(@PathVariable("id") Long id){
        ValorNormal v = valorNormalService.listarPorIdValor(id);
        if (v != null){
            return new ResponseEntity<>(v, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(v, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/updateById/{id}")
    public ResponseEntity<ValorNormal> actualizarValores(@PathVariable("id") Long id, @RequestBody ValorNormal input){
        input.setIdValoresNormales(id);
        ValorNormal v = valorNormalService.actualizarValor(input);
        if (v.getIdValoresNormales() != null){
            return new ResponseEntity<>(v, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(v, HttpStatus.NOT_MODIFIED);
        }

    }

    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<String> eliminarValor(@PathVariable("id") Long id){
        boolean deleted = valorNormalService.eliminarValor(id);
        if (deleted){
            return new ResponseEntity<>("Valor eliminado correctamente", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No existe el valor solicitado", HttpStatus.NOT_FOUND);
        }
    }
}
