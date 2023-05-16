package com.prolis.usuario.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity 
@Data
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPaciente;
    private Long IdIdentificacion;
    private String NumIdentificacion;
    private Long NumExpediente;
    private String NumINSS;
    private Long IdEstadoCivil;
    private String Email;
    private Long IdSexo;
    private Long IdNacionalidad;
    private Long IdPaisNac;
    private Long IdDepartamentoNac;
    private Long IdMunicipioNac;
    private Long IdPaisRes;
    private Long IdDepartamentoRes;
    private Long IdMunicipioRes;
    private Long IdTipoSangre;
    private Long IdProfesiones;
    private Long idReligion;
    private String PrimerNombre;
    private String SegundoNombre;
    private String PrimerApellido;
    private String SegundoApellido;
    private Date FechaNac;
    private String DireccionDomiciiar;
    private String TelefonoDomiciliar;
    private String TelefonoMovil;
    private String Activo;
    @Column (name="Emabrazada")
    private String Embarazada;
    private String Fallecido;
    private Short Estado;

    
    
}
