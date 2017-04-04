package com.gps.model;

public class Route {

    private final Coordinate begin;
    private final Coordinate end;

    public Route(Coordinate begin, Coordinate end) {
        this.begin = begin;
        this.end = end;
    }

    public Coordinate getBegin() {
        return begin;
    }

    public Coordinate getEnd() {
        return end;
    }

}
