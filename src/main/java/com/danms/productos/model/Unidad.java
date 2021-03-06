package com.danms.productos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Unidad {
    @Id
    private Integer id;
    private String descripcion_unidad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion_unidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion_unidad = descripcion;
    }
}
