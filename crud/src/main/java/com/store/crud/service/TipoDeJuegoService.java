package com.store.crud.service;

import com.store.crud.repository.TipoDeJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDeJuegoService {
    private TipoDeJuegoRepository tipoDeJuegoRepo;

    @Autowired
    public TipoDeJuegoService(TipoDeJuegoRepository tipoDeJuegoRepo) {
        this.tipoDeJuegoRepo = tipoDeJuegoRepo;
    }
}
