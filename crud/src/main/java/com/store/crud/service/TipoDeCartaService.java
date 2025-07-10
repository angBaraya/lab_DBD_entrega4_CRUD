package com.store.crud.service;

import com.store.crud.entity.TipoDeCarta;
import com.store.crud.repository.TipoDeCartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDeCartaService {
    private TipoDeCartaRepository tipoDeCartaRepo;

    @Autowired
    public TipoDeCartaService(TipoDeCartaRepository tipoDeCartaRepo) {
        this.tipoDeCartaRepo = tipoDeCartaRepo;
    }
    public List<TipoDeCarta> getAll() {
        return tipoDeCartaRepo.findAll();
    }
    public Optional<TipoDeCarta> getById(Long id_tipoDeCarta) {
        return tipoDeCartaRepo.findById(id_tipoDeCarta);
    }
    public TipoDeCarta save(TipoDeCarta tipoDeCarta) {
        return tipoDeCartaRepo.save(tipoDeCarta);
    }
    public TipoDeCarta update(TipoDeCarta tipoDeCarta) {
        return tipoDeCartaRepo.save(tipoDeCarta);
    }
    public void delete(Long id_tipoDeCarta) {
        tipoDeCartaRepo.deleteById(id_tipoDeCarta);
    }
}
