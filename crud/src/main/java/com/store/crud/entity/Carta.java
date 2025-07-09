package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Carta")
public class Carta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carta")
    private Long id_carta;

    @NotBlank(message = "La marca de la carta es obligatoria.")
    @Size(min = 4, max = 30, message = "La marca debe ser de 4 a 30 caracteres.")
    @Column(name = "marca", nullable = false, length = 30)
    private String marca;

    @Column(name = "estado", length = 20)
    private String estado;

    @Column(name = "coleccion", length = 50)
    private String coleccion;

    @Column(name = "rareza", length = 20)
    private String rareza;

    @Column(name = "anio")
    private Integer anio;

    @OneToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;

    //Esto crea la tabla intermedia cartaXtipo
    @ManyToMany
    @JoinTable(
            name = "cartaXtipo",
            joinColumns = @JoinColumn(name = "id_carta"),
            inverseJoinColumns = @JoinColumn(name = "id_tipo_carta")
    )
    private Set<TipoDeCarta> tiposDeCarta = new HashSet<>();

    public Carta(Long id_carta, String marca, String estado, String coleccion, String rareza, Integer anio, Producto producto) {
        this.id_carta = id_carta;
        this.marca = marca;
        this.estado = estado;
        this.coleccion = coleccion;
        this.rareza = rareza;
        this.anio = anio;
        this.producto = producto;
    }

    public Carta() {

    }
}
