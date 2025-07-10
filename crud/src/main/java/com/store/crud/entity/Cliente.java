package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
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

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;

    public Cliente(String rut_cliente, String user_cliente, String password_cliente, String direccion_cliente, String nombre_cliente, String apellido_cliente, TipoUsuario tipoUsuario) {
        this.rut_cliente = rut_cliente;
        this.user_cliente = user_cliente;
        this.password_cliente = password_cliente;
        this.direccion_cliente = direccion_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.tipoUsuario = tipoUsuario;
    }

    public Cliente() {

    }
}
