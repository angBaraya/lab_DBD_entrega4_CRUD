package com.store.crud.service;

import com.store.crud.entity.DetalleCarro;
import com.store.crud.repository.DetalleCarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleCarroService {
    private final DetalleCarroRepository detalleCarroRepo;

    @Autowired
    public DetalleCarroService(DetalleCarroRepository detalleCarroRepo) {
        this.detalleCarroRepo = detalleCarroRepo;
    }

    public List<DetalleCarro> getAll() {
        return detalleCarroRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<DetalleCarro> findById(Long id_detalleCarro) {
        return detalleCarroRepo.findById(id_detalleCarro);
    }
    public DetalleCarro save(DetalleCarro detalleCarro) {
        return detalleCarroRepo.save(detalleCarro);
    }
    public DetalleCarro update(DetalleCarro detalleCarro) {
        return detalleCarroRepo.save(detalleCarro);
    }
    public void delete(Long id_detalleCarro) {
        detalleCarroRepo.deleteById(id_detalleCarro);
    }

}
