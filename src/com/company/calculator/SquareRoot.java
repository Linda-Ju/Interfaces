package com.company.calculator;

public class SquareRoot implements Operation {
    private int number1;

    @Override
    public double operation() {
        return Math.sqrt(number1);
    }

    public SquareRoot(int number1) {
        this.number1 = number1;
    }
}
