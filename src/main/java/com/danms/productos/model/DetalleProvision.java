package com.danms.productos.model;


import javax.persistence.*;

@Entity
public class DetalleProvision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer cantidad;
    @ManyToOne()
    private Provision provision;
    @OneToOne
    private Producto producto;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
