package com.store.crud.service;

import com.store.crud.repository.ListaDeseosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListaDeseosService {
    private ListaDeseosRepository listaDeseosRepo;

    @Autowired
    public ListaDeseosService(ListaDeseosRepository listaDeseosRepo) {
        this.listaDeseosRepo = listaDeseosRepo;
    }
}
