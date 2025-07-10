package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "tipo_de_juego")
public class TipoDeJuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_juego")
    private Long id_tipo_juego;

    @Column(name = "nombre_juego", length = 30)
    private String nombre_juego;

    //Esto es para la tabla intermermedia juegoXtipo
    @ManyToMany(mappedBy = "tiposDeJuego")
    private Set<JuegoDeMesa> listaJuegos = new HashSet<>();


    /*
    Esto esta bien por como esta en el MR, pero no deberiamos cambiarlo.
    ya que esto lo quita el proposito a la tabla juegoXtipo que sale
    de la relación muchos a muchos entre JuegoDeMesa y TipoDeJuego.
    De momento lo dejo comentado para hacer la conexion ManyToMany,
    ahi vemos como la dejamos al final.
    @ManyToOne
    @JoinColumn(name = "codigo_juego", referencedColumnName = "codigo_juego")
    private JuegoDeMesa juegoDeMesa;
    */

    public TipoDeJuego(Long idTipoJuego, String nombreJuego) {
        this.id_tipo_juego = id_tipo_juego;
        this.nombre_juego = nombre_juego;
    }
    
    public TipoDeJuego() {}
}
