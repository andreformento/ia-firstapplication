package com.gps.model;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;

public class WorldMap {

    private final Iterable<Coordinate> coordinates;

    public WorldMap(Iterable<Coordinate> coordinates) {
        Preconditions.checkNotNull(coordinates);
        this.coordinates = ImmutableSet.copyOf(coordinates);
    }

    public Iterable<Coordinate> getCoordinates() {
        return coordinates;
    }

}
