package com.company.vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("Motorcycle Hooonk!");
    }

    @Override
    public void startEngine() {
        System.out.println("Motorcycle Engine started!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped!");
    }
}
