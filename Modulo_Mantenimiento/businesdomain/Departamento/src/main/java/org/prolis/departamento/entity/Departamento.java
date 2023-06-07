package org.prolis.departamento.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_departamento")
public class Departamento {

    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    @Column(name="IdDepartamento")
    private Long IdDepartamento;
    @Column(name="IdPais")
    private Long IdPais;
    @Column(name="Descripcion")
    private String Descripcion;
    @Column(name="Estado")
    private Long estado;

}