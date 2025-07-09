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

    //Un detale de boleta pertenece a una boleta.
    @OneToOne
    @JoinColumn(name = "id_boleta", referencedColumnName = "id_boleta")
    private Boleta boleta;

    //Un detalle de boleta puede tener varios productos.
    @OneToMany
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private List<Producto> productos;


}
