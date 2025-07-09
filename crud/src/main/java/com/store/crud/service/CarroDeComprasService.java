package com.store.crud.service;

import com.store.crud.repository.CarroDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroDeComprasService {
    private CarroDeComprasRepository carroDeComprasRepo;

    @Autowired
    public CarroDeComprasService(CarroDeComprasRepository carroDeComprasRepo) {
        this.carroDeComprasRepo = carroDeComprasRepo;
    }
}
