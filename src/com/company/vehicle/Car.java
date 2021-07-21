package com.company.vehicle;

public class Car implements Vehicle {
    @Override
    public void horn() {
        System.out.println("Car Hooonk!");
    }

    @Override
    public void startEngine() {
        System.out.println("Car Engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped!");
    }
}
