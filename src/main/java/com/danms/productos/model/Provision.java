package com.danms.productos.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "provision")
public class Provision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDate fechaProvision;
    @OneToMany(mappedBy = "provision", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleProvision> detalleProvision;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaProvision() {
        return fechaProvision;
    }

    public void setFechaProvision(LocalDate fechaProvision) {
        this.fechaProvision = fechaProvision;
    }
}
