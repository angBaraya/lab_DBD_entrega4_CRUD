package com.store.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


//luego manejo las llaves compuestas.
// https://stackoverflow.com/questions/212350/which-annotation-should-i-use-idclass-or-embeddedid

@Data
@Entity
public class TipoUsuarioXPermiso {

    @Id
    @Column(name = "id_tipo_usuario")
    private Long id_tipo_usuario;

    @Id
    @Column(name = "id_permiso")
    private Long id_permiso;

    public TipoUsuarioXPermiso(Long id_tipo_usuario, Long id_permiso) {
        this.id_tipo_usuario = id_tipo_usuario;
        this.id_permiso = id_permiso;
    }

    public TipoUsuarioXPermiso() {

    }
}
