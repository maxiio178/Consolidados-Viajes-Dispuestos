package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class PlanillaRecepcionPK implements Serializable {
    @Column(name= "codigo_planilla")
    private Integer codigoPlanilla;
    @Column(name= "turnos_idturnos")
    private Integer turnosIdTurnos;

    public Integer getCodigoPlanilla() {
        return codigoPlanilla;
    }

    public void setCodigoPlanilla(Integer codigoPlanilla) {
        this.codigoPlanilla = codigoPlanilla;
    }

    public Integer getTurnosIdTurnos() {
        return turnosIdTurnos;
    }

    public void setTurnosIdTurnos(Integer turnosIdTurnos) {
        this.turnosIdTurnos = turnosIdTurnos;
    }
}
