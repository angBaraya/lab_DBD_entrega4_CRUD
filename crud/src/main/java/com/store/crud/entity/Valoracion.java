package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@Table(name = "valoracion")
public class Valoracion{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valoracion")
    private Long id_valoracion;

    @Lob
    @Column(name = "review")
    private String review;

    @Min(1)
    @Max(5)
    @Column(name = "cantidad_estrellas")
    private Integer cantidad_estrellas;

    //Un cliente puede tener muchas valoraciones, y una valoracion pertenece a un cliente.
    @ManyToOne
    @JoinColumn(name = "rut_cliente", referencedColumnName = "rut_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    //Un producto puede tener muchas valoraciones, y una valoracion pertenece a un producto.
    //deberiamos cambiarlo en el mer, ahi tenemos 1:1
    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    private Producto producto;
}
