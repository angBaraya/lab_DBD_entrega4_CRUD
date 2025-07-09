package com.store.crud.service;

import com.store.crud.entity.Carta;
import com.store.crud.repository.CartaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaService {
    private CartaRepository cartaRepo;

    @Autowired
    public CartaService(CartaRepository cartaRepo) {
        this.cartaRepo = cartaRepo;
    }

    public List<Carta> getAll() {
        return cartaRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<Carta> findById(Long id_carta) {
        return cartaRepo.findById(id_carta);
    }
    public Carta save(Carta carta) {
        return cartaRepo.save(carta);
    }
    public Carta update(Carta carta) {
        return cartaRepo.save(carta);
    }
    public void delete(Long id_carta) {
        cartaRepo.deleteById(id_carta);
    }
}
