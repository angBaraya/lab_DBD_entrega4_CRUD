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
    @Column(name = "correo_usuario", nullable = false, unique = false, length = 100)
    private String correo_usuario;

    @NotBlank(message = "La contraseña es obligatoria.")
    @Size(min = 8, max = 60, message = "La contraseña debe tener entre 8 y 60 caracteres.")
    @Column(name = "password_usuario", nullable = false, length = 60)
    private String password_usuario;

    @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres.")
    @Column(name = "nombre_usuario", unique = false, length = 30)
    private String nombre_usuario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario", nullable = true)
    private TipoUsuario tipoUsuario;


    public Usuario(Long id_usuario, String correo, String password, String nombre, TipoUsuario tipoUsuario) {
        this.id_usuario = id_usuario;
        this.correo_usuario = correo;
        this.password_usuario = password;
        this.nombre_usuario = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo_usuario;
    }

    public void setCorreo(String correo) {
        this.correo_usuario = correo;
    }

    public String getPassword() {
        return password_usuario;
    }

    public void setPassword(String password) {
        this.password_usuario = password;
    }

    public String getNombre() {
        return nombre_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre_usuario = nombre;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {

    }
}
