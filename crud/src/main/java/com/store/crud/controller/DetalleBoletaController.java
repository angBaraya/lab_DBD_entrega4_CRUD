package com.store.crud.controller;

import com.store.crud.entity.DetalleBoleta;
import com.store.crud.service.DetalleBoletaService;
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
public class DetalleBoletaController {
    @Autowired
    private DetalleBoletaService detalleBoletaService;

    @GetMapping
    public ResponseEntity<List<DetalleBoleta>> getDetalleBoletas() {
        List<DetalleBoleta> detalleBoletas = detalleBoletaService.getAll();
        return ResponseEntity.ok(detalleBoletas);
    }

}
