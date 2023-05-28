package com.prolis.examen.controller;

import com.prolis.examen.entity.Examen;
import com.prolis.examen.service.ExamenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/examenes")
public class ExamenController {

    private ExamenService examenService;

    @PostMapping(path="/add")
    public ResponseEntity<Examen> crearExamen(@RequestBody Examen e){
        Examen examen = examenService.crearExamen(e);
        return new ResponseEntity<>(e, HttpStatus.CREATED);
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
        return new ResponseEntity<>(e, HttpStatus.OK);
    }

    @DeleteMapping(path="/deleteById/{id}")
    public  ResponseEntity<String> eliminarExamen(@PathVariable("id") Long id){
        boolean deleted = examenService.eliminarExamen(id);
        if (deleted){
            return new ResponseEntity<>("Examen eliminado correctamente", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No existe el examen solicitado", HttpStatus.NOT_FOUND);
        }
    }
}
