package com.rental.car.front.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class DolarConfig {

    @Value("${rentalservice.api.endpoint}" + "nbp/dolar")
    private String rentalGetDolarRateEndpoint;
}
