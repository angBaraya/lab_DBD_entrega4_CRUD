package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "rut_cliente", length = 12)
    private String rut_cliente;

    @Column(name = "user_cliente", length = 30, unique = true, nullable = false)
    private String user_cliente;

    @Column(name = "password_cliente", length = 60, nullable = false)
    private String password_cliente;

    @Column(name = "direccion_cliente", length = 100)
    private String direccion_cliente;

    @Column(name = "nombre_cliente", length = 30, nullable = false)
    private String nombre_cliente;

    @Column(name = "apellido_cliente", length = 30, nullable = false)
    private String apellido_cliente;

    @OneToOne
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;



}
