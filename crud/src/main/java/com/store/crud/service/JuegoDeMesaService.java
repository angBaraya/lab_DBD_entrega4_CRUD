package com.store.crud.service;

import com.store.crud.repository.JuegoDeMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegoDeMesaService {
    private JuegoDeMesaRepository juegoDeMesaRepo;

    @Autowired
    public JuegoDeMesaService(JuegoDeMesaRepository juegoDeMesaRepo) {
        this.juegoDeMesaRepo = juegoDeMesaRepo;
    }
}
