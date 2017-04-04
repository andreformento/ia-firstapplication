package com.gps.model;

import com.google.common.base.Preconditions;

import java.util.Objects;

public class Coordinate {

    // latitude  N S y
    private final Integer latitude;

    // longitude E W x
    private final Integer longitude;

    public Coordinate(Integer longitude, Integer latitude) {
        Preconditions.checkNotNull(longitude);
        Preconditions.checkNotNull(latitude);
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
