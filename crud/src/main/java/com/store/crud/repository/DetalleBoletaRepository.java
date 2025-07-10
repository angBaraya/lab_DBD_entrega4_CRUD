package com.store.crud.repository;

import com.store.crud.entity.DetalleBoleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, Long> {
}
