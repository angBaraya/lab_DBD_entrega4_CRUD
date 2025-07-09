package com.store.crud.service;

import com.store.crud.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoUsuarioService {
    private TipoUsuarioRepository tipoUsuarioRepo;

    @Autowired
    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepo) {
        this.tipoUsuarioRepo = tipoUsuarioRepo;
    }
}
