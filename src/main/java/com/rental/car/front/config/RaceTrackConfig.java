package com.rental.car.front.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RaceTrackConfig {

    @Value("${rentalservice.api.endpoint}" + "raceTracks")
    private String rentalGetAllRaceTracksEndpoint;

    @Value("${rentalservice.api.endpoint}" + "raceTracks/{raceTrackId}")
    private String rentalGetRaceTrackByIdEndpoint;

    @Value("${rentalservice.api.endpoint}" + "raceTracks")
    private String rentalAddRaceTrackEndpoint;

    @Value("${rentalservice.api.endpoint}" + "raceTracks/{raceTrackId}")
    private String rentalUpdateRaceTrackEndpoint;

    @Value("${rentalservice.api.endpoint}" + "raceTracks/{raceTrackId}")
    private String rentalDeleteRaceTrackEndpoint;
}
