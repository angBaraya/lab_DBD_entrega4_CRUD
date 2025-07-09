package com.store.crud.service;

import com.store.crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    private ProductoRepository productoRepo;

    @Autowired
    public ProductoService(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }
}
