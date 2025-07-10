package com.store.crud.controller;

import com.store.crud.service.ValoracionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locura")
@CrossOrigin(origins = "http://localhost:8080/") // no voy a mentir, no estoy seguro de este localhot
public class ValoracionController {

    @Autowired
    private ValoracionService valoracionService;

    @GetMapping
    public String getAll() {
        return "Valoraciones obtenidas correctamente"; // Este es un ejemplo, deberías retornar una lista de valoraciones
    }
}
