package com.store.crud.controller;

import com.store.crud.entity.TipoDeCarta;
import com.store.crud.service.TipoDeCartaService;
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
public class TipoDeCartaController {

    @Autowired
    private TipoDeCartaService tipoDeCartaService;

    @GetMapping
    public ResponseEntity<List<TipoDeCarta>> getTipoDeCartas() {
        List<TipoDeCarta> tipoDeCartas = tipoDeCartaService.getAll();
        return ResponseEntity.ok(tipoDeCartas);
    }
}
