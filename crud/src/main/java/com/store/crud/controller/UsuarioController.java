package com.store.crud.controller;

import com.store.crud.entity.Usuario;
import com.store.crud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//perdon por el nombre de las variables, pero no estoy pensando ahora mismo (funciona, asi que cuestionen los metodos, no los resultados)
@RestController
@RequestMapping("apio/hambre")
@CrossOrigin(origins = "http://localhost:8080/") // no voy a mentir, no estoy seguro de este localhot
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    //Se define la direccion al usar la funcion getAll
    @GetMapping("/tuki")
    public ResponseEntity<List<Usuario>> getAll() {
        List<Usuario> usuarios = usuarioService.getAll();
        return ResponseEntity.ok(usuarios);
    }


}
