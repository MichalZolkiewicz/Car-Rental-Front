package com.rental.car.front.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CarConfig {

    @Value("${rentalservice.api.endpoint}" + "cars")
    private String rentalGetCarsEndpoint;

    @Value("${rentalservice.api.endpoint}" + "cars/{carId}")
    private String rentalGetCarByIdEndpoint;

    @Value("${rentalservice.api.endpoint}" + "cars")
    private String rentalAddCarEndpoint;

    @Value("${rentalservice.api.endpoint}" + "cars")
    private String rentalUpdateCarEndpoint;

    @Value("${rentalservice.api.endpoint}" + "cars/{carId}")
    private String rentalDeleteCarByIdEndpoint;
}
