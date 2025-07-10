package com.store.crud.service;

import com.store.crud.entity.Producto;
import com.store.crud.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    private final ProductoRepository productoRepo;

    @Autowired
    public ProductoService(ProductoRepository productoRepo) {
        this.productoRepo = productoRepo;
    }

    public List<Producto> getAll() {
        return productoRepo.findAll();
    }
    //revisar antes de
    public Optional<Producto> findById(Long id_producto) {
        return productoRepo.findById(id_producto);
    }
    public Producto save(Producto producto) {
        return productoRepo.save(producto);
    }
    public Producto update(Producto producto) {
        return productoRepo.save(producto);
    }
    public void delete(Long id_producto) {
        productoRepo.deleteById(id_producto);
    }

}
