package org.prolis.pais.controller;

import lombok.AllArgsConstructor;
import org.prolis.pais.entity.Pais;
import org.prolis.pais.service.PaisService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("api/pais")
public class PaisController {
    private PaisService paisService;

    @PostMapping(path="/add")
    public ResponseEntity<Pais> crearPais(@RequestBody Pais p)
    {
        Pais pais = paisService.crearPais(p);
        return new ResponseEntity<>(pais, HttpStatus.CREATED);
    }

    // 3
    @GetMapping
    public ResponseEntity<List<Pais>> listarPaises(){
        List<Pais> paises = paisService.obtenerPaises();
        return new ResponseEntity<>(paises, HttpStatus.OK);
    }

    @GetMapping(path="/paisById/{id}")
    public ResponseEntity<Pais> listarPorIdPais(@PathVariable("id") Long id) {
        Pais p = paisService.listarPorIdPais(id);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PutMapping("updateById/{id}")
    public ResponseEntity<Pais> actualizarPais(@PathVariable("id") Long id, @RequestBody Pais input)
    {
        input.setIdPais(id);
        Pais p = paisService.actualizarPais(input);
        return new ResponseEntity<>(p, HttpStatus.OK);

    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<String> eliminarPais(@PathVariable("id")Long id)
    {
        paisService.eliminarPais(id);
        return new ResponseEntity<>("Pais eliminado correctamente", HttpStatus.OK);
    }


}
