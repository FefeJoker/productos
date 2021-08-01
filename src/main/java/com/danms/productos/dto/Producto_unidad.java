package com.danms.productos.dto;

public class Producto_unidad {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(Integer stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getDescripcion_unidad() {
        return descripcion_unidad;
    }

    public void setDescripcion_unidad(String descripcion_unidad) {
        this.descripcion_unidad = descripcion_unidad;
    }

    public Integer getId_prod() {
        return id_prod;
    }

    public void setId_prod(Integer id_prod) {
        this.id_prod = id_prod;
    }

    public Integer getId_unidad() {
        return id_unidad;
    }

    public void setId_unidad(Integer id_unidad) {
        this.id_unidad = id_unidad;
    }

    private Integer id_prod;
    private Integer id_unidad;
    private String nombre;
    private Double precio;
    private String descripcion_prod;
    private Integer stockActual;
    private Integer stockMinimo;
    private String descripcion_unidad;
}
