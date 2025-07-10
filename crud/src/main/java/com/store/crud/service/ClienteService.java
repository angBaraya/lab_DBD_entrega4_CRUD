package com.store.crud.service;

import com.store.crud.entity.Cliente;
import com.store.crud.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepo;

    @Autowired
    public ClienteService(ClienteRepository clienteRepo) {
        this.clienteRepo = clienteRepo;
    }

    public List<Cliente> getAll() {
        return clienteRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<Cliente> findById(String rut_cliente) {
        return clienteRepo.findById(rut_cliente);
    }
    public Cliente save(Cliente cliente) {
        return clienteRepo.save(cliente);
    }
    public Cliente update(Cliente cliente) {
        return clienteRepo.save(cliente);
    }
    public void delete(String rut_cliente) {
        clienteRepo.deleteById(rut_cliente);
    }
}
