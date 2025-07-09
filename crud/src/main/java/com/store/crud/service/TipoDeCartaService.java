package com.store.crud.service;

import com.store.crud.repository.TipoDeCartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDeCartaService {
    private TipoDeCartaRepository tipoDeCartaRepo;

    @Autowired
    public TipoDeCartaService(TipoDeCartaRepository tipoDeCartaRepo) {
        this.tipoDeCartaRepo = tipoDeCartaRepo;
    }
}
