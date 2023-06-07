package org.prolis.pais.controller;

import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
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
        Pais m = PaisService.listarPorIdPais(id);
        if (m != null){
            return new ResponseEntity<>(m, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(m, HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("updateById/{id}")
    public ResponseEntity<Pais> actualizarPais(@PathVariable("id") Long id, @RequestBody Pais input)
    {
        input.setIdPais(id);
       Pais m = PaisService.actualizarPais(input);
        if (m.getIdPais() != null){
            return new ResponseEntity<>(m, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(m, HttpStatus.NOT_MODIFIED);
        }


    }

    @RequestMapping(method = RequestMethod.OPTIONS, value="/**")
    public void manageOptions(Long id)
    {
        System.out.println(id);
    }
    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<JSONObject> eliminarPais(@PathVariable("id") Long id){
        JSONObject json = new JSONObject();

        boolean deleted = PaisService.eliminarPais(id);
        if (deleted){
            json.put("status", 200);
            return new ResponseEntity<>(json, HttpStatus.OK);
        }else{
            json.put("status", 400);
            return new ResponseEntity<>(json, HttpStatus.NOT_FOUND);
        }

    }
}

