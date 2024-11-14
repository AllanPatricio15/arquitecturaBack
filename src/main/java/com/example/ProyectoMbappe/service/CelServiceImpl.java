package com.example.ProyectoMbappe.service;

import com.example.ProyectoMbappe.entity.Cel;
import com.example.ProyectoMbappe.exception.CelNotFoundException;
import com.example.ProyectoMbappe.repository.CelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CelServiceImpl implements CelService{
    private final CelRepository celRepository;

    public CelServiceImpl(CelRepository celRepository) {
        this.celRepository = celRepository;
    }

    @Override
    public void crearCel(Cel cel) {
        celRepository.save(cel);
    }

    @Override
    public List<Cel> obtenerCarros() {
        return celRepository.findAll();
    }

    @Override
    public void actualizarCel(Long id, Cel cel) {
        Cel cel1 = celRepository.findById(id).orElseThrow(()->new CelNotFoundException("No se encontro el celular"));
        cel.setId(id);
        celRepository.save(cel);
    }

    @Override
    public void borrarCel(Long id) {
        celRepository.deleteById(id);
    }
}
