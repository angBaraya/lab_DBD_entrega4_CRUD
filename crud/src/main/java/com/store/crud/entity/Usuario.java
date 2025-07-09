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
    private String correo;

    @NotBlank(message = "La contraseña es obligatoria.")
    @Size(min = 8, max = 60, message = "La contraseña debe tener entre 8 y 60 caracteres.")
    @Column(name = "password_usuario", nullable = false, length = 60)
    private String password;

    @Size(min = 5, max = 30, message = "El nombre debe tener entre 5 y 30 caracteres.")
    @Column(name = "nombre_usuario", unique = false, length = 30)
    private String nombre;

    @OneToOne
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario", nullable = true)
    private TipoUsuario tipoUsuario;

    public Usuario(Long id_usuario, String correo, String password, String nombre, TipoUsuario tipoUsuario) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.password = password;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
