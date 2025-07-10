package com.store.crud.repository;

import com.store.crud.entity.Boleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoletaRepository extends JpaRepository<Boleta, Long> {
    List<Boleta> findByMedioPago(); // Metodo para buscar boletas por medio de pago

}
