package com.store.crud.service;

import com.store.crud.entity.TipoDeJuego;
import com.store.crud.repository.TipoDeJuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDeJuegoService {
    private final TipoDeJuegoRepository tipoDeJuegoRepo;

    @Autowired
    public TipoDeJuegoService(TipoDeJuegoRepository tipoDeJuegoRepo) {
        this.tipoDeJuegoRepo = tipoDeJuegoRepo;
    }
    public List<TipoDeJuego> getAll() {
        return tipoDeJuegoRepo.findAll();
    }
    public Optional<TipoDeJuego> getById(Long id_tipoDeJuego) {
        return tipoDeJuegoRepo.findById(id_tipoDeJuego);
    }
    public TipoDeJuego save(TipoDeJuego tipoDeJuego) {
        return tipoDeJuegoRepo.save(tipoDeJuego);
    }
    public TipoDeJuego update(TipoDeJuego tipoDeJuego) {
        return tipoDeJuegoRepo.save(tipoDeJuego);
    }
    //me falta revisar este
    public void delete(Long id_tipoDeJuego) {
        tipoDeJuegoRepo.deleteById(id_tipoDeJuego);
    }
}
