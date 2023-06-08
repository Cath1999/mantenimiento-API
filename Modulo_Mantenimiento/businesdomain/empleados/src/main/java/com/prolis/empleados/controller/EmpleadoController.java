package com.prolis.empleados.controller;

import com.prolis.empleados.entity.empleado;
import com.prolis.empleados.service.EmpleadoService;
import lombok.AllArgsConstructor;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
@RequestMapping("api/empleado")
public class EmpleadoController {
    private EmpleadoService px_service;

    // http://localhost:8082/api/empleado


    @PostMapping(path="/add")
    public ResponseEntity<empleado> crearEmpleado(@RequestBody empleado e)
    {
        empleado empleado = px_service.crearEmpleado(e);
        return new ResponseEntity<>(empleado, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<empleado>> listarEmpleado(){
        List<empleado> pxs = px_service.obtenerEmpleados();
        return new ResponseEntity<>(pxs, HttpStatus.OK);
    }


    //localhost:8082/api/empleado/empleadoById/{id}
    @GetMapping(path="/empleadoById/{id}")
    public ResponseEntity<empleado> ListarPorIdEmpleado(@PathVariable("id") Long id)
    {
        empleado px = px_service.listarPorIdEmpleado(id);
        return new ResponseEntity<>(px, HttpStatus.OK);
    }

    @PutMapping("updateById/{id}")
    public ResponseEntity<empleado> actualizarEmpleado(@PathVariable("id") Long id, @RequestBody empleado input)
    {
        input.setIdEmpleado(id);
        empleado e = px_service.actualizarEmpleado(input);
        return new ResponseEntity<>(e, HttpStatus.OK);

    }

    @DeleteMapping("deleteById/{id}")
    public ResponseEntity<JSONObject> eliminarEmpleado(@PathVariable("id")Long id)
    {
        JSONObject json = new JSONObject();
        json.put("status", 200);
        px_service.eliminarEmpleado(id);
        return new ResponseEntity<>(json, HttpStatus.OK); }



}
