package com.company.shapes;

public class ShapesDemo {
    public static void main(String[] args) {

    Shapes circle = new Circle();
    circle.perimeter();
    circle.area();

    Shapes square = new Square();
    square.perimeter();
    square.area();

    Shapes rectangle = new Rectangle();
    rectangle.perimeter();
    rectangle.area();

    Shapes triangle = new Triangle();
    triangle.perimeter();
    triangle.area();
    }
}
