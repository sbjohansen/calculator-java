package com.kodilla.calculatorjava;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 5);
        System.out.println(result);
        result = calculator.subtract(10, 5);
        System.out.println(result);
    }
}
