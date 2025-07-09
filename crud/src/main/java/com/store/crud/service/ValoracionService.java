package com.store.crud.service;

import com.store.crud.repository.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValoracionService {
    private ValoracionRepository valoracionRepo;

    @Autowired
    public ValoracionService(ValoracionRepository valoracionRepo) {
        this.valoracionRepo = valoracionRepo;
    }
}
