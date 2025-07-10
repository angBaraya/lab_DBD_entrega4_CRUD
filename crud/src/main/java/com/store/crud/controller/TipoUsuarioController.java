package com.store.crud.controller;

import com.store.crud.entity.TipoUsuario;
import com.store.crud.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("locura")
@CrossOrigin(origins = "http://localhost:8080/")

public class TipoUsuarioController {
    @Autowired
    private TipoUsuarioService TipoUsuarioService;

    @GetMapping
    public ResponseEntity<List<TipoUsuario>> gettipoUsuarios() {
        List<TipoUsuario> TipoUsuarios = TipoUsuarioService.getAll();
        return ResponseEntity.ok(TipoUsuarios);
    }
}
