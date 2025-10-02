package com.alex_chiga.race.data.abstractModels;

import com.alex_chiga.race.interfaces.Loading;
import com.alex_chiga.race.interfaces.Refuelled;

public abstract class Car extends Vehicle implements Refuelled {
    protected final double PERCENT_CONSUMPTION_FUEL = 0.01;
    protected double fuel;
    protected Car(String model, int speed) {
        super(model, speed);
        fuel = 1.0;
    }

    @Override
    public void refuel() {
        fuel = 1.0;
    }

    @Override
    public void move() {
        if (fuel <= 0) {
            refuel();
            return;
        }
        super.move();
        fuel -= PERCENT_CONSUMPTION_FUEL;
    }
}
