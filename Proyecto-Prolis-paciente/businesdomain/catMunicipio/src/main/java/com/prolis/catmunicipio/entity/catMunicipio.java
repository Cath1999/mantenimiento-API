package com.prolis.catmunicipio.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_catmunicipio")

public class catMunicipio {

    @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(name = "IdMunicipio")
    private Long IdMunicipio;

    @Column(name = "IdDepartamento")
    private int IdDepartamento;

    @Column(name = "Descripcion")
    private String Descripcion ;

//    private Long IdMunicipio;
//    private int IdDepartmento;
//    private String Descripcion;





}
