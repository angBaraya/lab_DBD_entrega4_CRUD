package com.store.crud.controller;

import com.store.crud.entity.CarroDeCompras;
import com.store.crud.entity.ListaDeseos;
import com.store.crud.service.ListaDeseosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.unmodifiableList;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8080/")
public class ListaDeseosController {

    @Autowired
    private ListaDeseosService listaDeseosService;

    @GetMapping
    public List<CarroDeCompras> getListaDeseos() {
        List<CarroDeCompras> listaDeseos = unmodifiableList(listaDeseosService.getAll());
        if (listaDeseos.isEmpty()) {
            return Collections.emptyList(); // Retorna una lista vacía si no hay deseos
        }
        return listaDeseos;
    }

    private List<CarroDeCompras> unmodifiableList(List<ListaDeseos> all) {
        return List.of();
    }
}
