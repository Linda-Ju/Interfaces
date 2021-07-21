package com.company.shapes;

public class Circle implements Shapes {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void perimeter() {
        float perimeter = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("Circle perimeter: " + perimeter);
    }

    @Override
    public void area() {
        float area = (float) (Math.PI * (radius * radius));
        System.out.println("Circle area: " + area);
    }


}
