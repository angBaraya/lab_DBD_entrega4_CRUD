package com.store.crud.service;

import com.store.crud.repository.DetalleBoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleBoletaService {
    private DetalleBoletaRepository detalleBoletaRepo;

    @Autowired
    public DetalleBoletaService(DetalleBoletaRepository detalleBoletaRepo) {
        this.detalleBoletaRepo = detalleBoletaRepo;
    }
}
