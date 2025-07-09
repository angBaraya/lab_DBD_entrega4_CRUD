package com.store.crud.service;

import com.store.crud.repository.DetalleCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCarroService {
    private DetalleCarroRepository detalleCarroRepo;

    @Autowired
    public DetalleCarroService(DetalleCarroRepository detalleCarroRepo) {
        this.detalleCarroRepo = detalleCarroRepo;
    }
}
