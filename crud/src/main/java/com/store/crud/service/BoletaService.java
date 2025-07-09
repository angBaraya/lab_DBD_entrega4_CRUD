package com.store.crud.service;

import com.store.crud.repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletaService {
    private BoletaRepository boletaRepo;

    @Autowired
    public BoletaService(BoletaRepository boletaRepo) {
        this.boletaRepo = boletaRepo;
    }
}
