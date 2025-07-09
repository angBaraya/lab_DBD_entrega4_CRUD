package com.store.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class CarroDeCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private Long id_carro;

    @Column(name = "rut_cliente", length = 12)
    private String rut_cliente;

    @OneToOne
    @JoinColumn(name = "rut_cliente", referencedColumnName = "rut_cliente")
    private Cliente cliente;

}
