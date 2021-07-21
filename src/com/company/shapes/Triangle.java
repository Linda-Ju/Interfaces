package com.company.shapes;

public class Triangle implements Shapes {

    int base = 5;
    int height = 5;
    int side = 7;

    @Override
    public void perimeter() {
        float perimeter = (float) (Math.pow(side,2) + base);
        System.out.println("Triangle perimeter: " + perimeter);
    }

    @Override
    public void area() {
        float area = (float) (Math.pow(base, height) / 2);
        System.out.println("Triangle area: " + area);
    }
}
