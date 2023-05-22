package org.prolis.pais.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_pais")
public class Pais {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "IdPais")
    private Long IdPais;
    @Column(name = "Descripcion")
    private String descripcion;
}
