package com.company.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.horn();

//        Motorcycle motorcycle = new Motorcycle();
//        motorcycle.horn();


        Vehicle car = new Car();
        car.startEngine();

        Vehicle motorcycle = new Motorcycle();
        motorcycle.startEngine();

        Bicycle bicycle = new Bicycle();
        bicycle.stopEngine(false);

    }
}
