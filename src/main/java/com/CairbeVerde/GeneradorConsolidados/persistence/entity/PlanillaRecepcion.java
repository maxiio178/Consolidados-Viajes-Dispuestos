package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="planillas_recepcion")
public class PlanillaRecepcion {
    @EmbeddedId
    private PlanillaRecepcionPK id;
    private LocalDate fecha;
}
