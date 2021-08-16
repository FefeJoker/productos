package com.danms.productos.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class MovimientosStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer cantidadEntrada;
    private Integer cantidadSalida;
    private Instant fecha;
    @OneToOne
    private Producto producto;
    @OneToOne
    private DetalleProvision detalleProvision;

    private DetallePedido detallePedido;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(Integer cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    public Integer getCantidadSalida() {
        return cantidadSalida;
    }

    public void setCantidadSalida(Integer cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public DetalleProvision getDetalleProvision() {
        return detalleProvision;
    }

    public void setDetalleProvision(DetalleProvision detalleProvision) {
        this.detalleProvision = detalleProvision;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }
}
