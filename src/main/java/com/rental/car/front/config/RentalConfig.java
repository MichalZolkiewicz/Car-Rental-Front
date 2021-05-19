package com.rental.car.front.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class RentalConfig {

    @Value("${rentalservice.api.endpoint}" + "rentals")
    private String rentalGetAllRentalsEndpoint;

    @Value("${rentalservice.api.endpoint}" + "rentals/{rentalId}")
    private String rentalGetRentalByIdEndpoint;

    @Value("${rentalservice.api.endpoint}" + "rentals")
    private String rentalCreateRentalEndpoint;

    @Value("${rentalservice.api.endpoint}" + "rentals/{rentalId}")
    private String rentalFinishRentalEndpoint;

    @Value("${rentalservice.api.endpoint}" + "rentals/{rentalId}")
    private String rentalDeleteRentalEndpoint;
}
