package com.prolis.catmunicipio.controller;

import com.prolis.catmunicipio.entity.catMunicipio;
import com.prolis.catmunicipio.service.catMunicipioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/catmunicipio")

public class municipioController {

    private catMunicipioService ctM_Service;

    // http://localhost:8081/api/catmunicipio
        @PostMapping(path="/add")
    public ResponseEntity<catMunicipio> crearMunicipio(@RequestBody catMunicipio cm) {
        catMunicipio ctm = ctM_Service.crearMunicipio(cm);
        return new ResponseEntity<>(cm, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<catMunicipio>> listarcatMunicipio(){
        List<catMunicipio> mn = ctM_Service.obtenerMunicipio();
        return new ResponseEntity<>(mn, HttpStatus.OK);
    }


    @GetMapping(path="/catMunicipioById/{id}")
    public ResponseEntity<catMunicipio> obtenerMpPorId(@PathVariable("id") Long id) {
        catMunicipio cms = ctM_Service.listarMunPorId(id);
        return new ResponseEntity<>(cms, HttpStatus.OK);
    }

    @PutMapping("id")
    public ResponseEntity<catMunicipio> actualizarMp(@PathVariable("id") Long id, @RequestBody catMunicipio input)
    {
        input.setIdMunicipio(id);
        catMunicipio cms = ctM_Service.actualizarMunicipio(input);
        return new ResponseEntity<>(cms, HttpStatus.OK);

    }

    @DeleteMapping("id")
    public ResponseEntity<String> eliminarMun(@PathVariable("id")Long id)
    {
        ctM_Service.eliminarMunicipio(id);
        return new ResponseEntity<>("Municipio eliminado correctamente", HttpStatus.OK);
    }

}
