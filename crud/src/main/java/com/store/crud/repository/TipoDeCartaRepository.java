package com.store.crud.repository;

import com.store.crud.entity.TipoDeCarta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDeCartaRepository extends JpaRepository<TipoDeCarta, Long> {
}
