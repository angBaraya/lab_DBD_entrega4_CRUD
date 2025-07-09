package com.store.crud.service;

import com.store.crud.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingService {
    private RankingRepository rankingRepo;

    @Autowired
    public RankingService(RankingRepository rankingRepo) {
        this.rankingRepo = rankingRepo;
    }
}
