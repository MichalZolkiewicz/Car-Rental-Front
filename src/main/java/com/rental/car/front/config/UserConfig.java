package com.rental.car.front.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class UserConfig {

    @Value("${rentalservice.api.endpoint}" + "users")
    private String rentalGetAllUsersEndpoint;

    @Value("${rentalservice.api.endpoint}" + "users/{userId}")
    private String rentalGetUserByIdEndpoint;

    @Value("${rentalservice.api.endpoint}" + "users")
    private String rentalAddUserEndpoint;

    @Value("${rentalservice.api.endpoint}" + "users/{userId}")
    private String rentalUpdateUserEndpoint;

    @Value("${rentalservice.api.endpoint}" + "users/{userId}")
    private String rentalDeleteUserEndpoint;
}
