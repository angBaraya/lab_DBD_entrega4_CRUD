package com.store.crud.service;

import com.store.crud.entity.CarroDeCompras;
import com.store.crud.repository.CarroDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroDeComprasService {
    private CarroDeComprasRepository carroDeComprasRepo;

    @Autowired
    public CarroDeComprasService(CarroDeComprasRepository carroDeComprasRepo) {
        this.carroDeComprasRepo = carroDeComprasRepo;
    }

    public List<CarroDeCompras> getAll(){
        return carroDeComprasRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<CarroDeCompras> findById(Long id_carro) {
        return carroDeComprasRepo.findById(id_carro);
    }
    public CarroDeCompras save(CarroDeCompras carroDeCompras) {
        return carroDeComprasRepo.save(carroDeCompras);
    }
    public CarroDeCompras update(CarroDeCompras carroDeCompras) {
        return carroDeComprasRepo.save(carroDeCompras);
    }
    public void delete(Long id_carro) {
        carroDeComprasRepo.deleteById(id_carro);
    }
}
