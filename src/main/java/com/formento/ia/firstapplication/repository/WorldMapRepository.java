package com.gps.repository;

import com.gps.model.WorldMap;

public class WorldMapRepository {

    private final CordinateRepository cordinateRepository;

    public WorldMapRepository(CordinateRepository cordinateRepository) {
        this.cordinateRepository = cordinateRepository;
    }

    // if you are a alien, you cannot use this method
    public WorldMap getWorldOfAllOfUs() {
        return new WorldMap(cordinateRepository.getAllCoordinatesOfTheWorld());
    }

}
