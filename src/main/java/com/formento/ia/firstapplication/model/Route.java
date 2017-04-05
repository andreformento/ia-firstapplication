package com.formento.ia.firstapplication.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static com.google.common.base.Preconditions.checkNotNull;

public class Route {

    private final Localization start;
    private final Localization end;

    public Route(final Localization start, final Localization end) {
        checkNotNull(start);
        checkNotNull(end);
        this.start = start;
        this.end = end;
    }

    public Localization getStart() {
        return start;
    }

    public Localization getEnd() {
        return end;
    }

    public Iterable<Coordinate> getCoordinates() {
        throw new NotImplementedException();
    }

}
