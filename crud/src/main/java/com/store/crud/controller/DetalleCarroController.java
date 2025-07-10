package com.store.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8080/")
public class DetalleCarroController {
    @Autowired
    public DetalleCarroController detalleCarroController;

    @GetMapping
    public String getDetalleCarro() {
        return "Detalle Carro de Compras";
    }
}
