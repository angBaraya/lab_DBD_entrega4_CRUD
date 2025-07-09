package com.store.crud.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.HashSet;


@Data
@Entity
@Table(name = "lista_deseos", uniqueConstraints = @UniqueConstraint(
        columnNames = {"id_producto", "rut_cliente"}))
public class ListaDeseos {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id_lista_deseos")
    private Long id_lista_deseos;

    @OneToOne
    @JoinColumn(name = "rut_cliente", referencedColumnName = "rut_cliente")
    private Cliente cliente;

    //Esto crea la tabla intermedia productoXlista_deseos
    @ManyToMany
    @JoinTable(
            name = "productoXlista_deseos",
            joinColumns = @JoinColumn(name = "id_lista_deseos"),
            inverseJoinColumns = @JoinColumn(name = "id_producto")
    )
    private Set<Producto> productos = new HashSet<>();

    public ListaDeseos() {}
}
