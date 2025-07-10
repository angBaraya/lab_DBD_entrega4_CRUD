package com.store.crud.service;

import com.store.crud.entity.Ranking;
import com.store.crud.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RankingService {
    private final RankingRepository rankingRepo;

    @Autowired
    public RankingService(RankingRepository rankingRepo) {
        this.rankingRepo = rankingRepo;
    }

    public List<Ranking> getAll() {
        return rankingRepo.findAll();
    }
    public Optional<Ranking> findById(Long id_ranking) {
        return rankingRepo.findById(id_ranking);
    }
    public Ranking save(Ranking ranking) {
        return rankingRepo.save(ranking);
    }
    public Ranking update(Ranking ranking) {
        return rankingRepo.save(ranking);
    }
    public void delete(Long id_ranking) {
        rankingRepo.deleteById(id_ranking);
    }
}
