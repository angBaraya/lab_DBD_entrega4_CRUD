package com.store.crud.controller;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.store.crud.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8080/")
public class ClienteController {

    @Autowired
    private ClienteController clienteController;

    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes() {
        List<Cliente> clientes = clienteController.getAll();
        return ResponseEntity.ok(clientes);
    }

    private List<Cliente> getAll() {
        return null;
    }
}
