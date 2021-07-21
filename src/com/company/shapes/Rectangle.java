package com.company.shapes;

public class Rectangle implements Shapes {
    int length = 5;
    int height = 3;

    @Override
    public void perimeter() {
        float perimeter = (length + height) * 2;
        System.out.println("Rectangle perimeter: " + perimeter);
    }

    @Override
    public void area() {
        float area = length * height;
        System.out.println("Rectangle area: " + area);
    }
}
