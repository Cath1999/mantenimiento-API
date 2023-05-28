package com.prolis.tipomuestra.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_tipomuestra")
public class TipoMuestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="IdTipoMuestra")
    private Long idTipoMuestra;
    @Column (name="Descripcion")
    private String descripcion;
    @Column (name="Estado")
    private Long estado;

}
