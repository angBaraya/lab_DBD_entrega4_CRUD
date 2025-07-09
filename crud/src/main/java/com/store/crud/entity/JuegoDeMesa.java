package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@Table(name = "juego_de_mesa")
public class JuegoDeMesa {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "codigo_juego")
    private long codigo_juego;

    @Column(name = "nombre_juego", length = 30, nullable = false)
    private String nombre_juego;

    @Column(name = "cantidad_de_jugadores")
    @Min(1)
    private Integer cantidad_de_jugadores;

    //Un juego de mesa es un producto.
    @OneToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;
}
