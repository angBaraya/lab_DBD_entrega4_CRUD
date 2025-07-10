package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Column(name = "cantidad_ventas")
    private Integer cantidad_ventas;

    @Column(name = "precio", nullable = false)
    private Integer precio;

    // Un producto puede estar en muchos carros de compras
    @OneToMany(mappedBy = "producto")
    private List<DetalleCarro> detallesCarro;

    @OneToMany(mappedBy = "producto")
    private List<DetalleBoleta> detalles;

    //Esto es para la tabla intermermedia productoXlista_deseos
    //indica que la definición de la relación se encuentra en la clase ListaDeseos
    //Asi no creamos una clase 'ProductoXListaDeseos'
    @ManyToMany(mappedBy = "productos")
    private Set<ListaDeseos> listasDeseos = new HashSet<>();

    //Esto es para la tabla intermermedia tiendaXproducto
    @ManyToMany(mappedBy = "productos")
    private Set<Tienda> listaTiendas = new HashSet<>();

    //Esto es para la tabla intermermedia carro_de_comprasXproducto
    @ManyToMany(mappedBy = "listaProductos")
    private Set<CarroDeCompras> listaCarros = new HashSet<>();

    //Esto es para la tabla intermermedia rakingXproducto
    @ManyToMany(mappedBy = "productos")
    private Set<Ranking> rankings = new HashSet<>();

    public Producto(Long id_producto, String url, Integer stock, String descripcion, Integer cantidad_ventas, Integer precio) {
        this.id_producto = id_producto;
        this.url = url;
        this.stock = stock;
        this.descripcion = descripcion;
        this.cantidad_ventas = cantidad_ventas;
        this.precio = precio;
    }

    public Producto() {

    }
}
