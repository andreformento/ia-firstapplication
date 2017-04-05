package com.formento.ia.firstapplication.model;

import static com.google.common.base.Preconditions.checkNotNull;

public class Localization {

    private final String description;
    private final Coordinate coordinate;

    public Localization(final String description, final Coordinate coordinate) {
        checkNotNull(description);
        checkNotNull(coordinate);
        this.description = description;
        this.coordinate = coordinate;
    }

    public String getDescription() {
        return description;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

}
