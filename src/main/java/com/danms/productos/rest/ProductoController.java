package com.danms.productos.rest;

import com.danms.productos.dto.Producto_unidad;
import com.danms.productos.model.Producto;
import com.danms.productos.model.Unidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.danms.productos.services.ProductoService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
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
    public ResponseEntity<Producto> crear(@RequestBody Producto_unidad pu){
        pu.setId_prod(null);
        Producto prod = new Producto();
        Unidad unidad = new Unidad();

        prod.setDescripcion_prod(pu.getDescripcion_prod());
        prod.setStockActual(pu.getStockActual());
        prod.setStockMinimo(pu.getStockMinimo());
        prod.setPrecio(pu.getPrecio());
        prod.setNombre(pu.getNombre());


        unidad.setId(pu.getId_unidad());
        unidad.setDescripcion(pu.getDescripcion_unidad());
        prod.setUnidad(unidad);

        System.out.println(pu.getId_unidad());

        Producto guardado = productoService.saveNewProducto(prod);

        return ResponseEntity.ok(guardado);
    }

    @GetMapping("/{id}/{cantidad}")
    public ResponseEntity<Boolean> hayStock(@PathVariable Integer id, @PathVariable Integer cantidad){
        Producto pDb = productoService.getProductoById(id).orElse(null);

        if(pDb == null){
            return ResponseEntity.notFound().build();
        }

        Boolean result = pDb.getStockActual() >= cantidad;

        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<List<Producto>> getAll(){
        return ResponseEntity.ok(productoService.getAll());
    }
}
