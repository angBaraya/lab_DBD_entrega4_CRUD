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

}
