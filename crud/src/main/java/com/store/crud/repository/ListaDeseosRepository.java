package com.store.crud.repository;

import com.store.crud.entity.ListaDeseos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaDeseosRepository extends JpaRepository<ListaDeseos, Long> {
}
