package com.store.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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

    public Permiso() {

    }
}
