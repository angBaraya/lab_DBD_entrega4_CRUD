package com.store.crud.controller;

import com.store.crud.entity.CarroDeCompras;
import com.store.crud.service.CarroDeComprasService;
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
public class CarroDeComprasController {
    @Autowired
    private CarroDeComprasService carroDeComprasService;

    @GetMapping
    public List<CarroDeCompras> GetAll() {
        return carroDeComprasService.getAll();
    }


}
