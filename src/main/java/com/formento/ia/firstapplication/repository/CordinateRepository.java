package com.formento.ia.firstapplication.repository;

import com.formento.ia.firstapplication.model.Coordinate;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Repository;

@Repository
public class CordinateRepository {

    private final static Iterable<Coordinate> COORDINATES = ImmutableList.<Coordinate>builder()
            .add(new Coordinate(1, 2))
            .add(new Coordinate(2, 3))
            .add(new Coordinate(8, 4))
            .add(new Coordinate(5, 0))
            .build();

    public Iterable<Coordinate> getAllCoordinatesOfTheWorld() {
        return COORDINATES;
    }

}
