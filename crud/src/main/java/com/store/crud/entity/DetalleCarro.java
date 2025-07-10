package com.store.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "detalle_carro")
public class DetalleCarro {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_detalle_carro")
    private Long id_detalle_carro;

    @Column(name = "cantidad")
    @Min(1)
    private Integer cantidad;

    /// Un detalle de carro pertenece a un carro de compras.
    @OneToOne
    @JoinColumn(name = "id_carro", referencedColumnName = "id_carro")
    private CarroDeCompras carro;

    /// Un detalle de carro tiene un producto
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

}
