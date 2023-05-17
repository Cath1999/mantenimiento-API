package com.prolis.empleado.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.format.DateTimeFormatter;
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
    private Date FechaCreacion;
    private Date FechaModificacion;
    private Date FechaEliminacion;
    private Long idMunicipioRes;
    private Long idMunicipioNac;
    private Long idDepartamentoNac;
    private Long IdDepartamentoRes;
    private Long IdPaisNac;
    private Long IdPaisRes;
    private Long IdIdentificacion;
    private Long IdEstadoCivil;
    private Long IdSexo;
    private Long IdNacionalidad;
    private String NumIdentificacion;
    private String NumINSS;
    private String CodMinsa;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private Date FechaNac;
    private String EdadIngreso;
    private String Email;
    private String DireccionDomiciliar;
    private String TelefonoDomiciliar;
    private String TelefonoMovil;
    private Date FechaContrato;
    private String UrlFoto;
    private String Activo;
    private Long Estado;



}
