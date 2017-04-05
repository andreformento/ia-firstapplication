package com.formento.ia.firstapplication.model;

import com.google.common.collect.ImmutableSet;

import static com.google.common.base.Preconditions.checkNotNull;

public class WorldMap {

    private final Iterable<Coordinate> coordinates;

    public WorldMap(final Iterable<Coordinate> coordinates) {
        checkNotNull(coordinates);
        this.coordinates = ImmutableSet.copyOf(coordinates);
    }

    public Iterable<Coordinate> getCoordinates() {
        return coordinates;
    }

}
