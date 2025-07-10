package com.store.crud.service;

import com.store.crud.entity.TipoUsuario;
import com.store.crud.repository.TipoUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoUsuarioService {
    private final TipoUsuarioRepository tipoUsuarioRepo;

    @Autowired
    public TipoUsuarioService(TipoUsuarioRepository tipoUsuarioRepo) {
        this.tipoUsuarioRepo = tipoUsuarioRepo;
    }

    public List<TipoUsuario> getAll() {
        return tipoUsuarioRepo.findAll();
    }
    public Optional<TipoUsuario> getById(Long id_tipoUsuario) {
        return tipoUsuarioRepo.findById(id_tipoUsuario);
    }
    public TipoUsuario save(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepo.save(tipoUsuario);
    }
    public TipoUsuario update(TipoUsuario tipoUsuario) {
        return tipoUsuarioRepo.save(tipoUsuario);
    }
    public void delete(Long id_tipoUsuario) {
        tipoUsuarioRepo.deleteById(id_tipoUsuario);
    }
}
