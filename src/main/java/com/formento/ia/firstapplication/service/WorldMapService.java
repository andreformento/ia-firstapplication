package com.gps.service;

import com.gps.repository.CordinateRepository;
import com.gps.repository.WorldMapRepository;

public class WorldMapService {

    private final WorldMapRepository repository = new WorldMapRepository(new CordinateRepository());

}
