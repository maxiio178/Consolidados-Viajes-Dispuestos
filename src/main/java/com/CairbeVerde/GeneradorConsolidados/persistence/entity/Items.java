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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDateTime getFechaPlanilla() {
        return fechaPlanilla;
    }

    public void setFechaPlanilla(LocalDateTime fechaPlanilla) {
        this.fechaPlanilla = fechaPlanilla;
    }

    public LocalDateTime getFechaSalita() {
        return fechaSalita;
    }

    public void setFechaSalita(LocalDateTime fechaSalita) {
        this.fechaSalita = fechaSalita;
    }

    public Integer getPlanillasRecepcionCodigoPlanilla() {
        return planillasRecepcionCodigoPlanilla;
    }

    public void setPlanillasRecepcionCodigoPlanilla(Integer planillasRecepcionCodigoPlanilla) {
        this.planillasRecepcionCodigoPlanilla = planillasRecepcionCodigoPlanilla;
    }

    public Integer getBarrioIdBarrio() {
        return barrioIdBarrio;
    }

    public void setBarrioIdBarrio(Integer barrioIdBarrio) {
        this.barrioIdBarrio = barrioIdBarrio;
    }

    public String getCamionesCodigo() {
        return camionesCodigo;
    }

    public void setCamionesCodigo(String camionesCodigo) {
        this.camionesCodigo = camionesCodigo;
    }

    public String getNitEmpresas() {
        return nitEmpresas;
    }

    public void setNitEmpresas(String nitEmpresas) {
        this.nitEmpresas = nitEmpresas;
    }

    public LocalDateTime getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(LocalDateTime horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public LocalDateTime getIniDescargue() {
        return iniDescargue;
    }

    public void setIniDescargue(LocalDateTime iniDescargue) {
        this.iniDescargue = iniDescargue;
    }

    public LocalDateTime getFinDescargue() {
        return finDescargue;
    }

    public void setFinDescargue(LocalDateTime finDescargue) {
        this.finDescargue = finDescargue;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getTimpoDescargue() {
        return timpoDescargue;
    }

    public void setTimpoDescargue(LocalDateTime timpoDescargue) {
        this.timpoDescargue = timpoDescargue;
    }

    public Integer getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(Integer pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public Integer getPesoFinal() {
        return PesoFinal;
    }

    public void setPesoFinal(Integer pesoFinal) {
        PesoFinal = pesoFinal;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getMcubico() {
        return mcubico;
    }

    public void setMcubico(Double mcubico) {
        this.mcubico = mcubico;
    }

    public Integer getCamionesPeso() {
        return camionesPeso;
    }

    public void setCamionesPeso(Integer camionesPeso) {
        this.camionesPeso = camionesPeso;
    }
}
