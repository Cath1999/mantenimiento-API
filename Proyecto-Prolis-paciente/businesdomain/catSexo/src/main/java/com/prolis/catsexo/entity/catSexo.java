package com.prolis.catsexo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_sexo")
public class catSexo {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long idsexo;
    private String descripcion;



}
