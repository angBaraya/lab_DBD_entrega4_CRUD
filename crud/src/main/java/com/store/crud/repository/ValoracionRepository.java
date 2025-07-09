package com.store.crud.repository;

import com.store.crud.entity.Valoracion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValoracionRepository extends JpaRepository<Valoracion, Long> {
}