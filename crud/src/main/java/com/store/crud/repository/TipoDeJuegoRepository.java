package com.store.crud.repository;

import com.store.crud.entity.TipoDeJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeJuegoRepository extends JpaRepository<TipoDeJuego, Long> {
}
