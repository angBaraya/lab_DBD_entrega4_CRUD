package com.store.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tienda {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private Long id;

    @Column(name = "nombre_tienda", length = 30, nullable = false)
    private String nombre;

    @Column(name = "direccion_tienda", length = 100)
    private String direccion;
}
