package com.company.calculator;

public class Division implements Operation {
    private int number1;
    private int number2;

    @Override
    public double operation() {
        return number1 / number2;
    }

    public Division(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
}
