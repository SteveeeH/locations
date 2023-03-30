package com.training.locations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LocationsServiceTest {

    @Test
    void getLocations() {
        LocationsService locationsService = new LocationsService();
        List<Location> locationsList = locationsService.getLocations();

        assertThat(locationsList)
                .hasSize(3)
                .extracting(Location::getName)
                .contains("Kisgebeháza", "Marajos", "Ittottfalu");
    }
}