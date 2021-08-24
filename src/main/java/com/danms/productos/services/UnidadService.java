package com.danms.productos.services;

import com.danms.productos.model.Unidad;
import com.danms.productos.repositories.UnidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadService {
    @Autowired
    UnidadRepository unidadRepository;

    public List<Unidad> getAll(){
        return unidadRepository.findAll();
    }
}
