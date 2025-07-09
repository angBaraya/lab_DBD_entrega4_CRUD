package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

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
}
