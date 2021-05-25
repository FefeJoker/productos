package com.danms.productos.services;

import com.danms.productos.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.danms.productos.repositories.ProductoRepository;

import java.util.Optional;
@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto saveNewProducto(Producto p){
        productoRepository.save(p);
        return p;
    }
    public Optional<Producto> getProductoById(Integer id){
        return Optional.of(productoRepository.getClienteById(id));
    }
}
