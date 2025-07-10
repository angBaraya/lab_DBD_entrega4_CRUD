package com.store.crud.service;

import com.store.crud.entity.Valoracion;
import com.store.crud.repository.ValoracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ValoracionService {
    private final ValoracionRepository valoracionRepo;

    @Autowired
    public ValoracionService(ValoracionRepository valoracionRepo) {
        this.valoracionRepo = valoracionRepo;
    }

    public List<Valoracion> getAll() {
        return valoracionRepo.findAll();
    }
    public Optional<Valoracion> getById(Long id_valoracion) {
        return valoracionRepo.findById(id_valoracion);
    }
    public Valoracion save(Valoracion valoracion) {
        return valoracionRepo.save(valoracion);
    }
    public Valoracion update(Valoracion valoracion) {
        return valoracionRepo.save(valoracion);
    }
    public void delete(Long id_valoracion) {
        valoracionRepo.deleteById(id_valoracion);
    }
}
