package com.store.crud.repository;

import com.store.crud.entity.DetalleCarro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleCarroRepository extends JpaRepository<DetalleCarro, Long> {
}
