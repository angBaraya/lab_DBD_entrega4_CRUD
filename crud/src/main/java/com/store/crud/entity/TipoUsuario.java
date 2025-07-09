package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_usuario")
    private Long id_tipo_usuario;

    @Column(name = "rol_usuario", nullable = false, length = 20)
    private String rol_usuario;

    public TipoUsuario(Long id_tipo_usuario, String rol_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.rol_usuario = rol_usuario;
    }

    public TipoUsuario() {

    }
}
