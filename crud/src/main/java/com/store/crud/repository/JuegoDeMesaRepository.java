package com.store.crud.repository;

import com.store.crud.entity.JuegoDeMesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegoDeMesaRepository extends JpaRepository<JuegoDeMesa, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
