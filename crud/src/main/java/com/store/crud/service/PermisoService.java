package com.store.crud.service;

import com.store.crud.repository.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermisoService {
    private PermisoRepository permisoRepo;

    @Autowired
    public PermisoService(PermisoRepository permisoRepo) {
        this.permisoRepo = permisoRepo;
    }
}
