package org.prolis.departamento.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_departamento")
public class Departamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long IdDepartamento;
    private Long IdPais;
    private String Descripcion;

}