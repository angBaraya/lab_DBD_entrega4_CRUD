package com.store.crud.controller;


import com.store.crud.entity.CarroDeCompras;
import com.store.crud.entity.JuegoDeMesa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8080/")
public class JuegoDeMesaController {

    @Autowired
    public JuegoDeMesaController juegoDeMesaController;

    @GetMapping
    public List<CarroDeCompras> findAll() {
        // Aquí deberías llamar al servicio que maneja los juegos de mesa
        // Por ejemplo: return juegoDeMesaService.getAll();
        // Pero como no hay un servicio definido en el código proporcionado, retornamos una lista vacía.
        return List.of(); // Retorna una lista vacía por ahora
    }


}
