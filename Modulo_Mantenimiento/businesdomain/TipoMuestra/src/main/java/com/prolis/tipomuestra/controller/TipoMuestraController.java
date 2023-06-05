package com.prolis.tipomuestra.controller;

import com.prolis.tipomuestra.entity.TipoMuestra;
import com.prolis.tipomuestra.service.TipoMuestraService;
import io.swagger.v3.core.util.Json;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.OPTIONS;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;
import java.util.List;

//@CrossOrigin("*")
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
    @RequestMapping(method = RequestMethod.OPTIONS, value="/**")
    public void manageOptions(Long id)
    {
        System.out.println(id);
    }
    @DeleteMapping(path="/deleteById/{id}")
    public ResponseEntity<JSONObject> eliminarMuestra(@PathVariable("id") Long id){
        JSONObject json = new JSONObject();

        boolean deleted = tipoMuestraService.eliminarMuestra(id);
        if (deleted){
            json.put("status", 200);
            return new ResponseEntity<>(json, HttpStatus.OK);
        }else{
            json.put("status", 400);
            return new ResponseEntity<>(json, HttpStatus.NOT_FOUND);
        }

    }
}
