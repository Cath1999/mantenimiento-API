package com.prolis.tipomuestra.controller;

import com.prolis.tipomuestra.entity.TipoMuestra;
import com.prolis.tipomuestra.service.TipoMuestraService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "{http://localhost:8080}")
@RestController
@AllArgsConstructor
@RequestMapping("api/muestras")
public class TipoMuestraController {

    private TipoMuestraService tipoMuestraService;

    @PostMapping(path="/add")
    public ResponseEntity<TipoMuestra> crearTipoMuestra(@RequestBody TipoMuestra m){
        TipoMuestra tipoMuestra = tipoMuestraService.crearTipoMuestra(m);
        return new ResponseEntity<>(tipoMuestra, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TipoMuestra>> listarTipoMuestras(){
        List<TipoMuestra> tipoMuestras = tipoMuestraService.obtenerMuestras();
        return new ResponseEntity<>(tipoMuestras, HttpStatus.OK);
    }

    @GetMapping(path="/getById/{id}")
    public ResponseEntity<TipoMuestra> listarporIdMuestra(@PathVariable("id") Long id){
        TipoMuestra m = tipoMuestraService.listarPorIdMuestra(id);
        if (m != null){
            return new ResponseEntity<>(m, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(m, HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping(path="/updateById/{id}")
    public ResponseEntity<TipoMuestra> actualizarMuestra(@PathVariable("id") Long id, @RequestBody TipoMuestra input){
        input.setIdTipoMuestra(id);
        TipoMuestra m = tipoMuestraService.actualizarMuestra(input);
        if (m.getIdTipoMuestra() != null){
            return new ResponseEntity<>(m, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(m, HttpStatus.NOT_MODIFIED);
        }


    }

    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<String> eliminarMuestra(@PathVariable("id") Long id){
        boolean deleted = tipoMuestraService.eliminarMuestra(id);
        if (deleted){
            return new ResponseEntity<>("Muestra eliminada correctamente", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("No existe la muestra solicitada", HttpStatus.NOT_FOUND);
        }

    }
}
