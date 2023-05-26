package org.prolis.municipio.controller;


import lombok.AllArgsConstructor;
import org.prolis.municipio.entity.Municipio;
import org.prolis.municipio.service.MunicipioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/municipio")

public class MunicipioController {


        private MunicipioService municipioService;

        // http://localhost:8081/api/municipio
        @PostMapping(path="/add")
        public ResponseEntity<Municipio> crearMunicipio(@RequestBody Municipio mn) {
            Municipio municipio = municipioService.crearMunicipio(mn);
            return new ResponseEntity<>(municipio, HttpStatus.CREATED);
        }

        @GetMapping
        public ResponseEntity<List<Municipio>> listarMunicipios(){
            List<Municipio> municipios = municipioService.obtenerMunicipios();
            return new ResponseEntity<>(municipios, HttpStatus.OK);
        }


        @GetMapping(path="/catMunicipioById/{id}")
        public ResponseEntity<Municipio> listarPorIdMunicipio(@PathVariable("id") Long id) {
            Municipio mn = municipioService.listarPorIdMunicipio(id);
            return new ResponseEntity<>(mn, HttpStatus.OK);
        }

        @PutMapping("id")
        public ResponseEntity<Municipio> actualizarMunicipio(@PathVariable("id") Long id, @RequestBody Municipio input)
        {
            input.setIdMunicipio(id);
            Municipio mn = municipioService.actualizarMunicipio(input);
            return new ResponseEntity<>(mn, HttpStatus.OK);

        }

        @DeleteMapping("id")
        public ResponseEntity<String> eliminarMunicipio(@PathVariable("id")Long id)
        {
            municipioService.eliminarMunicipio(id);
            return new ResponseEntity<>("Municipio eliminado correctamente", HttpStatus.OK);
        }

    }

