package com.prolis.cattipomuestra.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
@Component
public class CatTipoMuestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTipoMuestra;
    private Long Descripcion;
    private Long Estado;



}
