package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tipo_de_carta")
public class TipoDeCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_carta")
    private Long id_tipo_carta;

    @Column(name = "nombre_tipo_carta", length = 30)
    private String nombre_tipo_carta;

    //Esto es para la tabla intermermedia juegoXtipo
    @ManyToMany(mappedBy = "tiposDeCarta")
    private Set<Carta> listaCartas = new HashSet<>();

    public TipoDeCarta(long id_tipo_carta, String nombre_tipo_carta) {
        this.id_tipo_carta = id_tipo_carta;
        this.nombre_tipo_carta = nombre_tipo_carta;
    }

    public TipoDeCarta() {}
}
