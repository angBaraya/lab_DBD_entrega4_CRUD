package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tienda")
public class Tienda {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private Long id_tienda;

    @Column(name = "nombre_tienda", length = 30, nullable = false)
    private String nombre_tienda;

    @Column(name = "direccion_tienda", length = 100)
    private String direccion_tienda;

    //Esto crea la tabla intermedia tiendaXproducto
    @ManyToMany
    @JoinTable(
            name = "tiendaXproducto",
            joinColumns = @JoinColumn(name = "id_tienda"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private Set<Producto> productos = new HashSet<>();

    public Tienda(Long id, String nombre, String direccion) {
        this.id_tienda = id_tienda;
        this.nombre_tienda = nombre_tienda;
        this.direccion_tienda = direccion_tienda;
    }

    public Tienda() {

    }
}
