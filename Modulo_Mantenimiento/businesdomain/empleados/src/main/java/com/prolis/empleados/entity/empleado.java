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
    private Long idEmpleado;

    @Column(name = "IdProfesiones")
    private Long idProfesiones;

    @Column(name = "IdMunicipioRes")
    private Long idMunicipioRes;

    @Column(name = "IdMunicipioNac")
    private Long idMunicipioNac;

    @Column(name = "IdDepartamentoNac")
    private Long idDepartamentoNac;

    @Column(name = "IdDepartamentoRes")
    private Long idDepartamentoRes;

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
    private String codMinsa;

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
    private String  edadIngreso;

    @Column (name="Email")
    private String email;

    @Column (name="DireccionDomiciliar")
    private String direccionDomiciliar;

    @Column (name="TelefonoDomiciliar")
    private String telefonoDomiciliar;

    @Column (name="TelefonoMovil")
    private String telefonoMovil;
    @Column (name="FechaContrato")
    private Date fechaContrato;

    @Column (name="UrlFoto")
    private String urlFoto;
    @Column (name="Activo")
    private String activo;
    @Column (name="Estado")
    private Long estado;

}
