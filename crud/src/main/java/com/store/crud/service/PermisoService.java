package com.store.crud.service;

import com.store.crud.entity.Permiso;
import com.store.crud.repository.PermisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoService {
    private final PermisoRepository permisoRepo;

    @Autowired
    public PermisoService(PermisoRepository permisoRepo) {
        this.permisoRepo = permisoRepo;
    }

    public List<Permiso> getAll() {
        return permisoRepo.findAll();
    }
    public Optional<Permiso> getPermisoById(Long id_listaDeseos) {
        return permisoRepo.findById(id_listaDeseos);
    }
    public Permiso save(Permiso permiso) {
        return permisoRepo.save(permiso);
    }
    public Permiso update(Permiso permiso) {
        return permisoRepo.save(permiso);
    }
    public void delete(Long id_permiso) {
        permisoRepo.deleteById(id_permiso);
    }
}
