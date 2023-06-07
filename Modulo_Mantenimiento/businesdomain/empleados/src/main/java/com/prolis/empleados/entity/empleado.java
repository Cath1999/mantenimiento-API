package com.prolis.empleados.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "tbl_empleado")
@Data
public class empleado {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado")
    private Long IdEmpleado;

    @Column(name = "IdProfesionales")
    private Long IdProfesionales;

    @Column(name = "IdMunicipioRes")
    private Long IdMunicipioRes;

    @Column(name = "IdMunicipioNac")
    private Long IdMunicipioNac;

    @Column(name = "IdDepartamentoNac")
    private Long IdDepartamentoNac;

    @Column(name = "IIdDepartamentoRes")
    private Long IdDepartamentoRes;

    @Column (name="IdPaisNac")
    private Long idPaisNac;

    @Column (name="IdPaisRes")
    private Long idPaisRes;

    @Column (name="IdIdentificacion")
    private Long idIdentificacion;

    @Column (name="IdEstadoCivil")
    private Long idEstadoCivil;

    @Column (name="IdSexo")
    private Long idSexo;

    @Column (name="IdNacionalidad")
    private Long idNacionalidad;

    @Column (name="NumIdentificacion")
    private String numIdentificacion;

    @Column (name="NumINSS")
    private String numINSS;

    @Column (name="CodMinsa")
    private String CodMinsa;

    @Column (name="PrimerNombre")
    private String primerNombre;
    @Column (name="SegundoNombre")
    private String segundoNombre;
    @Column (name="PrimerApellido")
    private String primerApellido;
    @Column (name="SegundoApellido")
    private String segundoApellido;
    @Column (name="FechaNac")
    private Date fechaNac;

    @Column (name="EdadIngreso")
    private String  EdadIngreso;

    @Column (name="Email")
    private String email;

    @Column (name="DireccionDomiciliar")
    private String DireccionDomiciliar;

    @Column (name="TelefonoDomiciliar")
    private String TelefonoDomiciliar;

    @Column (name="TelefonoMovil")
    private String TelefonoMovil;
    @Column (name="FechaContrato")
    private Date FechaContrato;

    @Column (name="UrlFoto")
    private String UrlFoto;
    @Column (name="Activo")
    private String Activo;
    @Column (name="Estado")
    private Long estado;

}
