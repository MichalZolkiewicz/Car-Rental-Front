package com.rental.car.front.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@JsonIgnoreType
public class CarDto {

    private final Long id;
    private final String brand;
    private final String model;
    private final Double price;
    private final Double consumption;
    private final String status;
    private final Long kilometersStart;
    private final Long kilometersFinish;

}