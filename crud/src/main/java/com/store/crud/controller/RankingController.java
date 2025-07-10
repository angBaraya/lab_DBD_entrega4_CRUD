package com.store.crud.controller;

import com.store.crud.entity.Ranking;
import com.store.crud.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("locura")
@CrossOrigin(origins = "http://localhost:8080/")
public class RankingController {
    @Autowired
    private RankingService rankingService;

    @GetMapping
    public ResponseEntity<List<Ranking>> getRankings() {
        List<Ranking> rankings = rankingService.getAll();
        return ResponseEntity.ok(rankings);
    }
}
