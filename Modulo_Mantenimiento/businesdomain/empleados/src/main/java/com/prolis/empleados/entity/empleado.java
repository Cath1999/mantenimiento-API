package com.prolis.empleados.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_empleado")
@Data
public class empleado {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdEmpleado")
    private Long IdEmpleado;

    @Column(name = "IdProfesiones")
    private Long IdProfesiones;

    @Column(name = "PrimerNombre")
    private String PrimerNombre;

    @Column(name = "SegundoNombre")
    private String SegundoNombre;

    @Column(name = "PrimerApellido")
    private String PrimerApellido;

    @Column(name = "SegundoApellido")
    private String SegundoApellido;
}
