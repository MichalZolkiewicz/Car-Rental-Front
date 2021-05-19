package com.rental.car.front.gui;

import com.rental.car.front.config.DolarConfig;
import com.rental.car.front.domain.DolarRate;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

    @Autowired
    private final DolarConfig dolarConfig;
    private Grid<DolarRate> dolarGrid = new Grid<>(DolarRate.class);

    public MainView(DolarConfig dolarConfig) {
        this.dolarConfig = dolarConfig;
        dolarGrid.setColumns("dolarRate");

        add(dolarGrid);
        setSizeFull();
    }
}
