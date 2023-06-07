package org.prolis.pais.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)


    @Column(name = "IdPais")
    private Long idPais;
    @Column (name="Descripcion")
    private String descripcion;

    @Column(name="Estado")
    private Long estado;

}
