package com.store.crud.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @NotBlank(message = "El correo es obligatorio.")
    @Email(message = "Ingrese un correo valido.")
    @Column(name = "correo_usuario", nullable = false, unique = true, length = 100)
    private String correo;

    @NotBlank(message = "La contraseña es obligatoria.")
    @Size(min = 8, max = 60, message = "La contraseña debe tener entre 8 y 60 caracteres.")
    @Column(name = "password_usuario", nullable = false, length = 60)
    private String password;

    @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres.")
    @Column(name = "nombre_usuario", unique = true, length = 30)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    private TipoUsuario tipoUsuario;
}
