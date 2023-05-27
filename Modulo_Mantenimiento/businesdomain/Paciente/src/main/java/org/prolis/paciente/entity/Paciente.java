package org.prolis.paciente.entity;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_paciente")
public class Paciente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column (name="IdPaciente")
        private Long idPaciente;
        @Column (name="IdIdentificacion")
        private Long idIdentificacion;
        @Column (name="NumIdentificacion")
        private String numIdentificacion;
        @Column (name="NumExpediente")
        private Long numExpediente;
        @Column (name="NumINSS")
        private String numINSS;
        @Column (name="IdEstadoCivil")
        private Long idEstadoCivil;
        @Column (name="Email")
        private String email;
        @Column (name="IdSexo")
        private Long idSexo;
        @Column (name="IdNacionalidad")
        private Long idNacionalidad;
        @Column (name="IdPaisNac")
        private Long idPaisNac;
        @Column (name="IdDepartamentoNac")
        private Long idDepartamentoNac;
        @Column (name="IdMunicipioNac")
        private Long idMunicipioNac;
        @Column (name="IdPaisRes")
        private Long idPaisRes;
        @Column (name="IdDepartamentoRes")
        private Long idDepartamentoRes;
        @Column (name="IdMunicipioRes")
        private Long idMunicipioRes;
        @Column (name="IdTipoSangre")
        private Long idTipoSangre;
        @Column (name="IdProfesiones")
        private Long idProfesiones;
        @Column (name="idReligion")
        private Long idReligion;
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
        @Column (name="DireccionDomiciiar")
        private String direccionDomiciiar;
        @Column (name="TelefonoDomiciliar")
        private String telefonoDomiciliar;
        @Column (name="TelefonoMovil")
        private String telefonoMovil;
        @Column (name="Activo")
        private String activo;
        @Column (name="Emabrazada")
        private String embarazada;
        @Column (name="Fallecido")
        private String fallecido;
        @Column (name="Estado")
        private Short estado;



}
