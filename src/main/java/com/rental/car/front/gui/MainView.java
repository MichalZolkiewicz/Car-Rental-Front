package com.rental.car.front.gui;

import com.rental.car.front.config.CarConfig;
import com.rental.car.front.config.CarDtoList;
import com.rental.car.front.config.DolarConfig;
import com.rental.car.front.domain.CarDto;
import com.rental.car.front.domain.DolarRate;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import org.springframework.web.client.RestTemplate;

import java.util.List;

@Route
public class MainView extends VerticalLayout {


    private final DolarConfig dolarConfig;
    private final CarConfig carConfig;
    private Grid<DolarRate> dolarGrid = new Grid<>(DolarRate.class);
    private Grid<CarDto> carGrid = new Grid<>(CarDto.class);
    private RestTemplate restTemplate = new RestTemplate();

    public MainView(DolarConfig dolarConfig, CarConfig carConfig) {
        this.dolarConfig = dolarConfig;
        this.carConfig = carConfig;
        carGrid.setColumns("brand", "model", "price", "consumption", "status", "kilometersStart", "kilometersFinish");
        dolarGrid.setColumns("dolarRate");
        add(dolarGrid, carGrid);
        setSizeFull();
        refresh();
    }

    public DolarRate getDolarRate() {

        return restTemplate.getForObject(dolarConfig.getRentalGetDolarRateEndpoint(), DolarRate.class);
    }

    public List<CarDto> getAllCars() {

        CarDtoList response = restTemplate.getForObject(carConfig.getRentalGetCarsEndpoint(), CarDtoList.class);

        List<CarDto> cars = response.getCars();
        return cars;
    }

    public void refresh() {
        dolarGrid.setItems(getDolarRate());
    }
}
