package com.training.locations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LocationsControllerTest {

    @Mock
    LocationsService locationsService;

    @InjectMocks
    LocationsController locationsController;

    @Test
    void getLocations() {
        when(locationsService.getLocations()).thenReturn(
                List.of(
                        new Location("Kisgebeháza", 34.6347, 13.5433),
                        new Location("Marajos", 54.4353, 16.5345),
                        new Location("Ittottfalu", 42.2354, 22.4525)
                )
        );
        assertThat(locationsController.getLocations())
                .isEqualTo("[Location{name='Kisgebeháza'}, Location{name='Marajos'}, Location{name='Ittottfalu'}]");
    }
}