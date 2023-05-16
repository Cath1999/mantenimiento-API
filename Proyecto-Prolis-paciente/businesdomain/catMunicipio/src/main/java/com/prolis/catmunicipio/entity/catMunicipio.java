package com.prolis.catmunicipio.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class catMunicipio {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long IdMunicipio;
    private Long IdDepartmento;
    private String Descripcion;





}
