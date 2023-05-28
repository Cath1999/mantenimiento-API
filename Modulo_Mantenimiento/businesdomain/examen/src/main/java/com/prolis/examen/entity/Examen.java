package com.prolis.examen.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_examenes")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column (name="IdExamen")
    private Long idExamen;
    @Column (name="IdAreaLabServicio")
    private Long idAreaLabServicio;
    @Column (name="IdMetodologia")
    private Long idMetodologia;
    @Column (name="IdCategoriaExamenes")
    private Long idCategoriaExamenes;
    @Column (name="IdTipoMuestra")
    private Long idTipoMuestra;
    @Column (name="IdUnidadMedidas")
    private Long idUnidadMedidas;
    @Column (name="IdTipoResultado")
    private Long idTipoResultado;
    @Column (name="Descripcion")
    private String descripcion;
    @Column (name="DescripcionCorta")
    private String descripcionCorta;
    @Column (name="LisCode")
    private String lisCode;
    @Column (name="Conteo")
    private String conteo;
    @Column (name="Confidencial")
    private String confidencial;
    @Column (name="Calculado")
    private String calculado;
    @Column (name="Estado")
    private Long estado;

}
