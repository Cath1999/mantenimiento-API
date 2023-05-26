package org.prolis.sexo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tbl_cat_sexo")
public class Sexo {

    @Id

    @Column(name = "IdSexo")
    private Long IdSexo;
    @Column(name = "Descripcion")
    private String descripcion;

}
