package org.prolis.municipio.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_municipio")

public class Municipio {

        @Id
//    @GeneratedValue (strategy = GenerationType.IDENTITY)

        @Column(name = "IdMunicipio")
        private Long IdMunicipio;

        @Column(name = "IdDepartamento")
        private int IdDepartamento;

        @Column(name = "Descripcion")
        private String descripcion ;



    }
