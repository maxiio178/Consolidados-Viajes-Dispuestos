package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name= "empresas")
@Entity
public class Empresas {
    @Column(name= "nit")
    private String nit;
    @Column(name= "nombre")
    private String nombre;
    @Column(name= "direccion")
    private String direccion;
    @Column(name= "telefono_empresa")
    private String telefonoEmpresa;
    @Column(name= "dane")
    private String dane;
    @Column(name= "nit")
    private Integer tipo;
    @Column(name= "Facturar")
    private String facturar;
    @Column(name= "Estado")
    private String estado;
    @Column(name= "Nuap")
    private Integer Nuap;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDane() {
        return dane;
    }

    public void setDane(String dane) {
        this.dane = dane;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getFacturar() {
        return facturar;
    }

    public void setFacturar(String facturar) {
        this.facturar = facturar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNuap() {
        return Nuap;
    }

    public void setNuap(Integer nuap) {
        Nuap = nuap;
    }
}
