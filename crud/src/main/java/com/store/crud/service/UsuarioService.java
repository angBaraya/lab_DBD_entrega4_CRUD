package com.store.crud.service;

import com.store.crud.entity.Usuario;
import com.store.crud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//aqui estan las funciones que se utilizaran (el crud)
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    //read: lee todos los usuarios
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }
    //read: lee a los usuarios por id
    public Usuario findById(Long id) {
        return  usuarioRepository.findById(id).get();
    }
    //create: crea a los usuarios
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //update: actualiza la informacion de los usuarios
    public Usuario update(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    //delete: elimina al usuario dada una id
    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }

}




