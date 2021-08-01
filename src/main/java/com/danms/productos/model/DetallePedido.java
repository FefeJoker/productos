package com.danms.productos.model;

import javax.persistence.*;


public class DetallePedido {
    private Integer id;
    private Integer cantidad;
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
