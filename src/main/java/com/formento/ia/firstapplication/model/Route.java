package com.formento.ia.firstapplication.model;

import static com.google.common.base.Preconditions.checkNotNull;

public class Route {

    private final Coordinate start;
    private final Coordinate end;

    public Route(final Coordinate start, final Coordinate end) {
        checkNotNull(start);
        checkNotNull(end);
        this.start = start;
        this.end = end;
    }

    public Coordinate getStart() {
        return start;
    }

    public Coordinate getEnd() {
        return end;
    }

}
