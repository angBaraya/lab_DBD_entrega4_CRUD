package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "boleta")
public class Boleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_boleta")
    private Long id_boleta;

    @Column(name = "medio_de_pago", length = 20)
    private String medio_de_pago;

    @Column(name = "fecha_de_emision")
    private LocalDateTime fecha_de_emision;

    @OneToOne
    @JoinColumn(name = "id_carro", referencedColumnName = "id_carro")
    private CarroDeCompras carro;

    public Boleta(Long id_boleta, String medio_de_pago, LocalDateTime fecha_de_emision, CarroDeCompras carro) {
        this.id_boleta = id_boleta;
        this.medio_de_pago = medio_de_pago;
        this.fecha_de_emision = fecha_de_emision;
        this.carro = carro;
    }
    public Boleta() {}
}
