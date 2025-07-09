package com.store.crud.repository;

import com.store.crud.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//se supone que usando jpa hace la creacion, actualizacion, leer y delete (osea que con esto basta)
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
