package com.example.ProyectoMbappe.controller;

import com.example.ProyectoMbappe.entity.Cel;
import com.example.ProyectoMbappe.service.CelService;
import com.example.ProyectoMbappe.service.CelServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juego")
public class CelController {
    private final CelServiceImpl celService;

    public CelController(CelServiceImpl celService) {
        this.celService = celService;
    }
    @GetMapping
    public List<Cel> obtenerCel() {
        return this.celService.obtenerCarros();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCel(@RequestBody Cel cel) {
        this.celService.crearCel(cel);
    }

    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void actuCel(@PathVariable Long id, @RequestBody Cel cel) {
        celService.actualizarCel(id, cel);
    }

    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void borrarCel(@PathVariable Long id) {
        this.celService.borrarCel(id);
    }
}
