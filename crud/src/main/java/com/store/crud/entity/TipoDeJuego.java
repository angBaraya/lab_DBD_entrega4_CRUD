package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Tipo_de_Juego")
public class TipoDeJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_juego")
    private Long idTipoJuego;

    @Column(name = "nombre_juego", length = 30)
    private String nombreJuego;

    @ManyToOne
    @JoinColumn(name = "codigo_juego", referencedColumnName = "codigo_juego")
    private JuegoDeMesa juegoDeMesa;

    public TipoDeJuego(Long idTipoJuego, String nombreJuego, JuegoDeMesa juegoDeMesa) {
        this.idTipoJuego = idTipoJuego;
        this.nombreJuego = nombreJuego;
        this.juegoDeMesa = juegoDeMesa;
    }
    
    public TipoDeJuego() {}
}
