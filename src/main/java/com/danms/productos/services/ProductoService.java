package com.danms.productos.services;

import com.danms.productos.model.Producto;
import com.danms.productos.repositories.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.danms.productos.repositories.ProductoRepository;

import java.util.List;
import java.util.Optional;
@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    UnidadRepository unidadRepository;

    public Producto saveNewProducto(Producto p){
        System.out.println(p.getUnidad().getId());
        productoRepository.save(p);
        return p;
    }
    public Optional<Producto> getProductoById(Integer id){
        return Optional.of(productoRepository.getClienteById(id));
    }

    public List<Producto> getAll(){
        return productoRepository.findAll();
    }
}
