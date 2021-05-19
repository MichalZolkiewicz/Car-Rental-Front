package com.rental.car.front.config;

import com.rental.car.front.domain.CarDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CarDtoList {

    private List<CarDto> cars;

    public CarDtoList() {
        cars = new ArrayList<>();
    }
}
