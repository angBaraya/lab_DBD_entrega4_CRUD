package com.store.crud.service;

import com.store.crud.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaService {
    private TiendaRepository tiendaRepo;

    @Autowired
    public TiendaService(TiendaRepository tiendaRepo) {
        this.tiendaRepo = tiendaRepo;
    }
}
