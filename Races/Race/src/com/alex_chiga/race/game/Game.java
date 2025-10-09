package com.alex_chiga.race.game;

import com.alex_chiga.race.data.Bicycle;
import com.alex_chiga.race.data.SportCar;
import com.alex_chiga.race.data.Truck;
import com.alex_chiga.race.data.abstractModels.Vehicle;

public class Game {

    private final Vehicle[] vehicles;

    public Game() {
        vehicles = new Vehicle[]{
                new Bicycle("bysecle01", 90),
                new SportCar("toyota", 90),
                new Truck("truck", 90)
        };
    }

    public void start() {
        int range = 1000_000;
        int distance = 0;
        Vehicle vehicleWinner = null;
        while (distance <= range) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                distance = vehicle.getCordX();
                if (distance > range) {
                    vehicleWinner = vehicle;
                    break;
                }
            }
        }
        System.out.println("Win " + vehicleWinner);
    }
}
