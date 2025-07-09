package com.store.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import java.util.HashSet;

@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "ventas")
    private Integer cantidad_ventas;

    @Column(name = "precio", nullable = false)
    private Integer precio;

    //Esto es para la tabla intermermedia productoXlista_deseos
    //indica que la definición de la relación se encuentra en la clase ListaDeseos
    //Asi no creamos una clase 'ProductoXListaDeseos'
    @ManyToMany(mappedBy = "productos")
    private Set<ListaDeseos> listasDeseos = new HashSet<>();

    //Esto es para la tabla intermermedia tiendaXproducto
    @ManyToMany(mappedBy = "productos")
    private Set<Tienda> listaTiendas = new HashSet<>();

    //Esto es para la tabla intermermedia carro_de_comprasXproducto
    @ManyToMany(mappedBy = "productos")
    private Set<CarroDeCompras> listaCarros = new HashSet<>();

    //Esto es para la tabla intermermedia rakingXproducto
    @ManyToMany(mappedBy = "productos")
    private Set<Ranking> rankings = new HashSet<>();

    public Producto(Long id, String url, Integer stock, String descripcion, Integer cantidad_ventas, Integer precio) {
        this.id = id;
        this.url = url;
        this.stock = stock;
        this.descripcion = descripcion;
        this.cantidad_ventas = cantidad_ventas;
        this.precio = precio;
    }

    public Producto() {

    }
}
