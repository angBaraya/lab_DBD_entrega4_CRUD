package com.store.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

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
