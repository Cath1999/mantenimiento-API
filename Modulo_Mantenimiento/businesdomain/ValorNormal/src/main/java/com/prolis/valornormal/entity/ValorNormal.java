package com.prolis.valornormal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_valoresnormales")
public class ValorNormal {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column (name="IdValoresNormales")
    private Long idValoresNormales;
    @Column (name="IdExamen")
    private Long idExamen;
    @Column (name="IdSexo")
    private Long idSexo;
    @Column (name="RangoAlto")
    private Long rangoAlto;
    @Column (name="RangoBajo")
    private Long rangoBajo;
    @Column (name="Estado")
    private Long estado;
}
