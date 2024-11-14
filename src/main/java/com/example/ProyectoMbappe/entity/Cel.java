package com.example.ProyectoMbappe.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cel")
public class Cel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String genero;
    private String desarrollador;
    private String plataforma;
    private String descripcion;
    private String precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
