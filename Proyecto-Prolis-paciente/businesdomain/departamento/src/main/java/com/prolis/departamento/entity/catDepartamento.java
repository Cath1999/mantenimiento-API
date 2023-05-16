package com.prolis.departamento.entity;


import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Data

public class catDepartamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long IdDepartamento;
    private Long IdPais;
    private String Descripcion;

}
