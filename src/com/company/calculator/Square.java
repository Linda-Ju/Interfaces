package com.company.calculator;

public class Square implements Operation {
    private int number1;

    @Override
    public double operation() {
        return Math.pow(number1, 2);
    }

    public Square(int number1) {
        this.number1 = number1;
    }
}
