package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name="planillas_recepcion")
public class PlanillaRecepcion {
    @EmbeddedId
    private PlanillaRecepcionPK id;
    private LocalDateTime fecha;

    public PlanillaRecepcionPK getId() {
        return id;
    }

    public void setId(PlanillaRecepcionPK id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
