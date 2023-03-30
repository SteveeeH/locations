package com.training.locations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LocationsIT {

    @Autowired
    LocationsController locationsController;

    @Test
    void getLocations() {
        assertThat(locationsController.getLocations())
                .isEqualTo("[Location{name='Kisgebeháza'}, Location{name='Marajos'}, Location{name='Ittottfalu'}]");
    }
}
