package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name="planillas_recepcion")
public class PlanillaRecepcion {
    @Id
    @Column(name= "codigo_planilla")
    private Integer codigoPlanilla;
    @Id
    @Column(name= "turnos_idturnos")
    private Integer turnosIdTurnos;
    @Column(name= "fecha")
    private LocalDate fecha;
}
