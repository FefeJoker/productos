package com.danms.productos.rest;

import com.danms.productos.model.Unidad;
import com.danms.productos.services.UnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/unidad")
public class UnidadController {

    @Autowired
    UnidadService unidadService;

    @GetMapping
    public List<Unidad> getAll(){
        return unidadService.getAll();
    }
}
