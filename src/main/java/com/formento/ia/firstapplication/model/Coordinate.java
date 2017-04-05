package com.formento.ia.firstapplication.model;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkNotNull;

public class Coordinate {

    // latitude  N S y
    private final Integer latitude;

    // longitude E W x
    private final Integer longitude;

    public Coordinate(final Integer longitude, final Integer latitude) {
        checkNotNull(longitude);
        checkNotNull(latitude);
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(latitude, that.latitude) &&
                Objects.equals(longitude, that.longitude);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(latitude, longitude);
    }

}
