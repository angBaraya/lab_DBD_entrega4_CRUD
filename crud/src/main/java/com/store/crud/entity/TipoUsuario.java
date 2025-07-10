package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

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

    //Esto crea la tabla intermedia tipo_usuarioXpermiso
    @ManyToMany
    @JoinTable(
            name = "tipo_usuarioXpermiso",
            joinColumns = @JoinColumn(name = "id_tipo_usuario"),
            inverseJoinColumns = @JoinColumn(name = "id_permiso")
    )
    private Set<Permiso> permisos = new HashSet<>();

    public TipoUsuario(Long id_tipo_usuario, String rol_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.rol_usuario = rol_usuario;
    }

    public Long getId_tipo_usuario() {
        return id_tipo_usuario;
    }

    public void setId_tipo_usuario(Long id_tipo_usuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public String getRol_usuario() {
        return rol_usuario;
    }

    public void setRol_usuario(String rol_usuario) {
        this.rol_usuario = rol_usuario;
    }

    public Set<Permiso> getPermisos() {
        return permisos;
    }
    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }


    public TipoUsuario() {

    }
}
