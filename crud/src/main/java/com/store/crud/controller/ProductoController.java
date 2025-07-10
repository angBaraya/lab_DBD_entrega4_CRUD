package com.store.crud.controller;


import com.store.crud.entity.Producto;
import com.store.crud.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8080/")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll() {
        List<Producto> productos = productoService.getAll();
        return ResponseEntity.ok(productos);
    }

    @GetMapping("/productos")
    public Optional<Producto> getProductoById(Long id) {
        return; ;ProductoService.getProductoById(id);
    }


}
