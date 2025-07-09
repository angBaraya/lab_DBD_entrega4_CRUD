package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "permiso")
public class Permiso {

    @Id
    @Column(name = "id_permiso")
    private Long id_permiso;

    @Column(name = "tipo_permiso", length = 50)
    private String tipo_permiso;

    public Permiso(Long id_permiso, String tipo_permiso) {
        this.id_permiso = id_permiso;
        this.tipo_permiso = tipo_permiso;
    }

    //Esto es para la tabla intermedia tipo_usuarioXpermiso
    //indica que la definición de la relación se encuentra en la clase TipoUsuario
    @ManyToMany(mappedBy = "permisos")
    private Set<TipoUsuario> tiposUsuario = new HashSet<>();

    public Permiso() {

    }
}
