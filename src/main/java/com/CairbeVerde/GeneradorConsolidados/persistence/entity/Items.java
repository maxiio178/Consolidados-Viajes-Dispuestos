package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "items")
public class Items {
    @Id
    private Integer id;
    private String recibo;
    private Integer item;
    @Column(name= "codigo_empleado")
    private Integer codigoEmpleado;
    @Column(name="fecha_planilla")
    private LocalDateTime fechaPlanilla;
    @Column(name="fecha_salida")
    private LocalDateTime fechaSalita;
    @Column(name = "planillas_recepcion_codigo_planilla")
    private Integer planillasRecepcionCodigoPlanilla
    @Column(name = "barrios_idbarrio")
    private Integer barrioIdBarrio;
    @Column(name = "camiones_codigo")
    private String camionesCodigo;
    @Column(name ="nit_empresas")
    private String nitEmpresas;
    @Column(name ="hora_llegada")
    private LocalDateTime horaLLegada;
    @Column(name ="ini_descargue")
    private LocalDateTime iniDescargue;
    @Column(name ="fin_descargue")
    private LocalDateTime finDescargue;
    @Column(name ="hora_salida")
    private LocalDateTime horaSalida;
    @Column(name ="tiempo_descargue")
    private LocalDateTime timpoDescargue;
    @Column(name ="peso_bruto")
    private Integer pesoBruto;
    @Column(name ="peso_final")
    private Integer PesoFinal;
    private String ruta;
    @Column(name ="Observaciones")
    private String observacion;
    private Integer tipo;
    private Double mcubico;
    @Column(name ="camiones_peso")
    private Integer camionesPeso;
}
