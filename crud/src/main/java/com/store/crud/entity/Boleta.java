package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleta")
    private Long id_boleta;

    @Column(name = "medio_de_pago", length = 20)
    private String medio_de_pago;

    @Column(name = "fecha_de_emision")
    private String fecha_de_emision;

    public Boleta(Long id_boleta, String medio_de_pago, String fecha_de_emision) {
        this.id_boleta = id_boleta;
        this.medio_de_pago = medio_de_pago;
        this.fecha_de_emision = fecha_de_emision;
    }

    public Boleta() {

    }
}
