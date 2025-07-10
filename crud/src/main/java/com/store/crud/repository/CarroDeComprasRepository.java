package com.store.crud.repository;

import com.store.crud.entity.CarroDeCompras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroDeComprasRepository extends JpaRepository<CarroDeCompras, Long> {

}
