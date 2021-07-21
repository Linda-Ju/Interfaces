package com.company.shapes;

public class Square implements Shapes {

    int side = 5;

    @Override
    public void perimeter() {
        float perimeter = side * 4;
        System.out.println("Square perimeter: " + perimeter);
    }

    @Override
    public void area() {
        float area = side * 2;
        System.out.println("Square area: " + area);
    }
}
