package com.company.vehicle;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("Doesn't honk, bell dings!");
    }

    @Override
    public void startEngine() {
        System.out.println("Doesn't have engine, pedal with your feet");
    }

    @Override
    public void stopEngine() {

    }

    public void stopEngine(boolean isOn) {
        if(isOn){
            System.out.println("Stop pedalling");
        }else{
            System.out.println("Bicycle is not in use");
        }
    }
}
