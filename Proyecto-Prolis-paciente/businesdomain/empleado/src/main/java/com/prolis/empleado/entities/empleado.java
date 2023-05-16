package com.prolis.empleado.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long idEmpleado;
    private Long idProfesiones;
    private Long idUsuarioCreacion;
    private Long idUsuarioEliminacion;

    private Long idUsuarioModificacion;

    private Date 
     }
