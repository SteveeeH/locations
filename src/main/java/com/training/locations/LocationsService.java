package com.training.locations;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LocationsService {

    private List<Location> locations = Arrays.asList(
            new Location("Kisgebeháza", 34.6347, 13.5433),
            new Location("Marajos", 54.4353, 16.5345),
            new Location("Ittottfalu", 42.2354, 22.4525)
    );

    public List<Location> getLocations() {
        return locations;
    }
}
