package com.store.crud.service;

import com.store.crud.entity.Boleta;
import com.store.crud.repository.BoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletaService {
    private final BoletaRepository boletaRepo;

    @Autowired
    public BoletaService(BoletaRepository boletaRepo) {
        this.boletaRepo = boletaRepo;
    }

    public List<Boleta> getAll() {
        return boletaRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<Boleta> findById(Long id_Boleta) {
        return boletaRepo.findById(id_Boleta);
    }
    public Boleta save(Boleta boleta) {
        return boletaRepo.save(boleta);
    }
    public void delete(Long id_boleta) {
        boletaRepo.deleteById(id_boleta);
    }
    public Boleta update(Boleta boleta){
        return boletaRepo.save(boleta);
    }

    public List<Boleta> getBoletasByMedioPago() {
        return boletaRepo.findByMedioPago();
    }
}