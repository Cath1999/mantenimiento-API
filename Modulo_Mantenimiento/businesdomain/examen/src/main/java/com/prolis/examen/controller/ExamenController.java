package com.prolis.examen.controller;

import com.prolis.examen.entity.Examen;
import com.prolis.examen.service.ExamenService;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/examenes")
public class ExamenController {

    private ExamenService examenService;

    @PostMapping(path="/add")
    public ResponseEntity<Examen> crearExamen(@RequestBody Examen e){
        Examen examen = examenService.crearExamen(e);
        return new ResponseEntity<>(examen, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Examen>> listarExamen(){
        List<Examen> examenes = examenService.obtenerExamenes();
        return new ResponseEntity<>(examenes, HttpStatus.OK);
    }

    @GetMapping(path="/getById/{id}")
    public ResponseEntity<Examen> listarPorIdExamen(@PathVariable("id") Long id){
        Examen e = examenService.listarPorIdExamen(id);
        if (e != null){
            return new ResponseEntity<>(e, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path="/updateById/{id}")
    public ResponseEntity<Examen> actualizarExamen(@PathVariable("id") Long id, @RequestBody Examen input){
        input.setIdExamen(id);
        Examen e = examenService.actualizarExamen(input);
        if (e.getIdExamen() != null){
            return new ResponseEntity<>(e, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(e, HttpStatus.NOT_MODIFIED);
        }

    }

    @DeleteMapping(path="/deleteById/{id}")
    public  ResponseEntity<JSONObject> eliminarExamen(@PathVariable("id") Long id)
    {
        JSONObject json = new JSONObject();
        json.put("status", 200);
        examenService.eliminarExamen(id);
        return new ResponseEntity<>(json, HttpStatus.OK);
    }
}
