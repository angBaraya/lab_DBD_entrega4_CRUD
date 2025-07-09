package com.store.crud.entity;

public class Ranking {



    CREATE TABLE IF NOT EXISTS ranking(
            id_ranking SERIAL,
            fecha_actualizacion DATE,
            posicion_ranking INT NOT NULL CHECK (posicion_ranking > 0),
    PRIMARY KEY (id_ranking)
);

}
