package com.alex_chiga.race.data;

import com.alex_chiga.race.interfaces.Acceleration;
import com.alex_chiga.race.interfaces.Breakable;
import com.alex_chiga.race.util.CalcRandom;

public abstract class Vehicle implements Acceleration, Breakable {
    protected static int totalDistance = 0;
    protected final String model;
    protected int speed;
    int cordX;

    public Vehicle(String model, int cordX, int speed) {
        this.model = model;
        this.cordX = cordX;
        this.speed = speed;
    }

    public void speed(int speed) {
        if (speed <= 0) {
            System.out.println("Неверная скорость");
            return;
        }
        this.speed += speed;
        System.out.println("Ускорение " + this.getClass().getSimpleName() + " = " + speed);
    }

    public boolean isBroken() {
        int chance = CalcRandom.calcRandom();
        return (isChanceBroken(chance));
    }

    private boolean isChanceBroken(int percent) {
        double chanceBroken = 0.75;
        return percent >= chanceBroken;
    }

    public void move() {
        if (isBroken()) {
            System.out.println("Поломка");
            return;
        }
        this.cordX += speed;
    }

}
