package com.CairbeVerde.GeneradorConsolidados.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="materiales")
public class Material {
    @Id
    private Integer idMaterial;
    @Column(name="nombre_material")
    private String nombreMaterial;
    @Column(name="valor_tons")
    private Float valorTons;
    @Column(name="valor_m3")
    private Float valorMQ;
    @Column(name="tipo_resuduo")
    private Integer tipoResiduo;

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public Float getValorTons() {
        return valorTons;
    }

    public void setValorTons(Float valorTons) {
        this.valorTons = valorTons;
    }

    public Float getValorMQ() {
        return valorMQ;
    }

    public void setValorMQ(Float valorMQ) {
        this.valorMQ = valorMQ;
    }

    public Integer getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(Integer tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }
}
