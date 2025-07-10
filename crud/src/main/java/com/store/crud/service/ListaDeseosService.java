package com.store.crud.service;

import com.store.crud.entity.ListaDeseos;
import com.store.crud.repository.ListaDeseosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListaDeseosService {
    private final ListaDeseosRepository listaDeseosRepo;

    @Autowired
    public ListaDeseosService(ListaDeseosRepository listaDeseosRepo) {
        this.listaDeseosRepo = listaDeseosRepo;
    }

    public List<ListaDeseos> getAll() {return listaDeseosRepo.findAll();}
    public Optional<ListaDeseos> getById(Long id_listaDeseos) {return listaDeseosRepo.findById(id_listaDeseos);}
    public ListaDeseos save(ListaDeseos listaDeseos) {return listaDeseosRepo.save(listaDeseos);}
    public ListaDeseos update(ListaDeseos listaDeseos) {return listaDeseosRepo.save(listaDeseos);}
    public void delete(Long id_listaDeseos) {listaDeseosRepo.deleteById(id_listaDeseos);}


}
