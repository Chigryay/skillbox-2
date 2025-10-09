package com.alex_chiga.race.data;

import com.alex_chiga.race.data.abstractModels.Car;
import com.alex_chiga.race.interfaces.Loading;

public class Truck extends Car implements Loading {
    private final double PERCENT_CARGO = 0.2;
    public Truck(String model, int speed) {
        super(model, speed);
        cargo();
    }

    @Override
    public void cargo() {
        this.speed -= (int) (this.speed * PERCENT_CARGO);
    }
}
