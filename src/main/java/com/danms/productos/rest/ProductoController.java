package com.danms.productos.rest;

import com.danms.productos.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.danms.productos.services.ProductoService;

import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Producto> productoPorId(@PathVariable Integer id){

        Optional<Producto> c = productoService.getProductoById(id);
        return ResponseEntity.of(c);
    }

    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto nuevo){
        nuevo.setId(null);
        Producto guardado = productoService.saveNewProducto(nuevo);
        return ResponseEntity.ok(guardado);
    }

}
