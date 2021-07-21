package com.company.calculator;

import java.util.Scanner;

public class OperationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        Operation add = new Add(number1, number2);
        System.out.println("add = " + add.operation());

        Operation subtract = new Subtract(number1, number2);
        System.out.println("subtract = " + subtract.operation());

        Operation division = new Division(number1, number2);
        System.out.println("division = " + division.operation());

        Operation multiply = new Multiplication(number1, number2);
        System.out.println("multiply = " + multiply.operation());

        Operation square = new Square(number1);
        System.out.println("square = " + square.operation());

        Operation squareRoot = new SquareRoot(number1);
        System.out.println("squareRoot = " + squareRoot.operation());
    }
}
