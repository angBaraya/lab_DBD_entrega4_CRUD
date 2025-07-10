package com.store.crud.service;

import com.store.crud.entity.DetalleBoleta;
import com.store.crud.repository.DetalleBoletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleBoletaService {
    //el final no sé si va
    private final DetalleBoletaRepository detalleBoletaRepo;

    @Autowired
    public DetalleBoletaService(DetalleBoletaRepository detalleBoletaRepo) {
        this.detalleBoletaRepo = detalleBoletaRepo;
    }
    public List<DetalleBoleta> getAll() {
        return detalleBoletaRepo.findAll();
    }
    //Revisar esto, el optional es por si no existe
    public Optional<DetalleBoleta> findById(Long id) {
        return detalleBoletaRepo.findById(id);
    }
    public DetalleBoleta save(DetalleBoleta detalleBoleta) {
        return detalleBoletaRepo.save(detalleBoleta);
    }
    public void delete(Long id) {
        detalleBoletaRepo.deleteById(id);
    }
    public DetalleBoleta update(DetalleBoleta detalleBoleta) {
        return detalleBoletaRepo.save(detalleBoleta);
    }

}
