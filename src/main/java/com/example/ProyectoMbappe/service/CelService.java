package com.example.ProyectoMbappe.service;

import com.example.ProyectoMbappe.entity.Cel;

import java.util.List;

public interface CelService {
    void crearCel (Cel cel);
    List<Cel> obtenerCarros ();
    void actualizarCel (Long id, Cel cel);
    void borrarCel (Long id);
}
