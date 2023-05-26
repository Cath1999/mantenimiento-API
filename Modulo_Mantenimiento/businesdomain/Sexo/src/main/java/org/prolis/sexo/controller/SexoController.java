package org.prolis.sexo.controller;


import org.prolis.sexo.entity.Sexo;
import org.prolis.sexo.service.SexoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/sexo")
public class SexoController {

    private SexoService sexoService;

    @PostMapping(path="/add")
    public ResponseEntity<Sexo> crearSexo(@RequestBody Sexo s)
    {
        Sexo sexo = sexoService.crearSexo(s);
        return new ResponseEntity<>(sexo, HttpStatus.CREATED);
    }

    // 3
    @GetMapping
    public ResponseEntity<List<Sexo>> listarSexos(){
        List<Sexo > sexos = sexoService.obtenerSexos();
        return new ResponseEntity<>(sexos, HttpStatus.OK);
    }

    @GetMapping(path="/sexoById/{id}")
    public ResponseEntity<Sexo > listarPorIdSexo(@PathVariable("id") Long id) {
        Sexo  s =sexoService.listarPorIdSexo (id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PutMapping("id")
    public ResponseEntity<Sexo > actualizarPais(@PathVariable("id") Long id, @RequestBody Sexo  input)
    {
        input.setIdSexo(id);
        Sexo  s = sexoService.actualizarSexo (input);
        return new ResponseEntity<>(s, HttpStatus.OK);

    }

    @DeleteMapping("id")
    public ResponseEntity<String> eliminarSexo (@PathVariable("id")Long id)
    {
        sexoService.eliminarSexo (id);
        return new ResponseEntity<>("Sexo  eliminado correctamente", HttpStatus.OK);
    }


}


