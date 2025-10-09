package com.alex_chiga.race.data.abstractModels;

import com.alex_chiga.race.interfaces.Acceleration;
import com.alex_chiga.race.interfaces.Breakable;
import com.alex_chiga.race.util.CalcRandom;

public abstract class Vehicle implements Acceleration, Breakable {
    protected final String model;
    protected int speed;
    protected int cordX;

    protected Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        cordX = 0;
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
        double chanceBroken = 75;
        return percent >= chanceBroken;
    }

    public void move() {
        if (isBroken()) {
            System.out.println("Поломка " + model);
            return;
        }
        this.cordX += speed;
        System.out.println(model + " проехала " + cordX);
    }

    public int getCordX() {
        return cordX;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                '}';
    }
}
