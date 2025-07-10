package com.store.crud.controller;

import com.store.crud.entity.Boleta;
import com.store.crud.entity.DetalleCarro;
import com.store.crud.service.BoletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("locura")
@CrossOrigin(origins = "http://localhost:8080/")
public class BoletaController {
    @Autowired
    private BoletaService boletaService;

    @GetMapping
    public ResponseEntity<List<Boleta>> getBoleta(){
        return ResponseEntity.ok(boletaService.getAll());
    }

    //filtra las boletas por el medio de pago que fue utilizado
    @GetMapping("/medio/")
    public List<Boleta> getBoletasByMedioPago() {
        return boletaService.getBoletasByMedioPago();
    }
}
