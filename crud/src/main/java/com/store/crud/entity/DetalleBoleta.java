package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_boleta")
public class DetalleBoleta {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_detalle_boleta")
    private Long id_detalle_boleta;

    @Column(name = "cantidad")
    @Min(1)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "id_boleta", referencedColumnName = "id_boleta")
    private Boleta boleta;

    @ManyToOne
    @JoinColumn(name = "id_producto") // Esto es lo que usa como foreign key
    private Producto producto;

    public DetalleBoleta(Long id_detalle_boleta, Integer cantidad, Boleta boleta, Producto producto) {
        this.id_detalle_boleta = id_detalle_boleta;
        this.cantidad = cantidad;
        this.boleta = boleta;
        this.producto = producto;
    }

    public DetalleBoleta() {}
}
