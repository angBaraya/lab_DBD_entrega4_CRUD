package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "ranking")
public class Ranking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ranking")
    private Long id_ranking;

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fecha_actualizacion;

    @Positive
    @Column(name = "posicion_ranking", nullable = false)
    private Integer posicion_ranking;

    @ManyToMany
    @JoinTable(
            name = "rankingXproducto",
            joinColumns = @JoinColumn(name = "id_ranking"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private Set<Producto> productos = new HashSet<>();

    public Ranking(Long id_ranking, LocalDateTime fecha_actualizacion, Integer posicion_ranking) {
        this.id_ranking = id_ranking;
        this.fecha_actualizacion = fecha_actualizacion;
        this.posicion_ranking = posicion_ranking;
    }

    public Ranking() {}

}
