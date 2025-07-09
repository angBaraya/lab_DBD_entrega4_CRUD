package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tipo de Carta")
public class TipoDeCarta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_carta")
    private long id_tipo_carta;

    @Column(name = "nombre_tipo_carta", length = 30)
    private String nombre_tipo_carta;

    @ManyToOne
    @JoinColumn(name = "id_carta", referencedColumnName = "id_carta")
    private Carta carta;
}
