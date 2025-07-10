package com.store.crud.service;

import com.store.crud.entity.JuegoDeMesa;
import com.store.crud.repository.JuegoDeMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuegoDeMesaService {
    private final JuegoDeMesaRepository juegoDeMesaRepo;

    @Autowired
    public JuegoDeMesaService(JuegoDeMesaRepository juegoDeMesaRepo) {
        this.juegoDeMesaRepo = juegoDeMesaRepo;
    }

    public List<JuegoDeMesa> findAll() {
        return juegoDeMesaRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<JuegoDeMesa> findById(Long codigo_juego) {
        return juegoDeMesaRepo.findById(codigo_juego);
    }
    public JuegoDeMesa save(JuegoDeMesa juegoDeMesa) {
        return juegoDeMesaRepo.save(juegoDeMesa);
    }
    public JuegoDeMesa update(JuegoDeMesa juegoDeMesa) {
        return juegoDeMesaRepo.save(juegoDeMesa);
    }
    public void delete(Long codigo_juego) {
        juegoDeMesaRepo.deleteById(codigo_juego);
    }
}
