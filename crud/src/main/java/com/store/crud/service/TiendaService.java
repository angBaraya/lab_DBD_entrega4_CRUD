package com.store.crud.service;

import com.store.crud.entity.Tienda;
import com.store.crud.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiendaService {
    private TiendaRepository tiendaRepo;

    @Autowired
    public TiendaService(TiendaRepository tiendaRepo) {
        this.tiendaRepo = tiendaRepo;
    }
    public List<Tienda> getAll() {
        return tiendaRepo.findAll();
    }
    public Optional<Tienda> getById(Long id_tienda) {
        return tiendaRepo.findById(id_tienda);
    }
    public Tienda save(Tienda tienda) {
        return tiendaRepo.save(tienda);
    }
    public Tienda update(Tienda tienda) {
        return tiendaRepo.save(tienda);
    }
    public void delete(Long id_tienda) {
        tiendaRepo.deleteById(id_tienda);
    }

}
