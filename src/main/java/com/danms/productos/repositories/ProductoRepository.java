package com.danms.productos.repositories;


import com.danms.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    public Producto getClienteById(Integer id);
}
