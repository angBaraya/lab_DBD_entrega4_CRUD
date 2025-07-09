package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "carro_de_compras")
public class CarroDeCompras{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long id_carro;

    /*
    @Column(name = "rut_cliente", length = 12)
    private String rut_cliente;
    */

    @OneToOne
    @JoinColumn(name = "rut_cliente", referencedColumnName = "rut_cliente")
    private Cliente cliente;

    //Esto crea la tabla intermedia carro_de_comprasXproducto
    @ManyToMany
    @JoinTable(
            name = "carro_de_comprasXproducto",
            joinColumns = @JoinColumn(name = "id_carro"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private Set<Producto> listaProductos = new HashSet<>();

}
