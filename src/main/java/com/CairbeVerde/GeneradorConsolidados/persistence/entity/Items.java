package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Items {
    @Id
    private Integer id;
    private String recibo;
    private Integer item;
    @Column(name= "codigo_empleado")
    private Integer codigoEmpleado;
}
