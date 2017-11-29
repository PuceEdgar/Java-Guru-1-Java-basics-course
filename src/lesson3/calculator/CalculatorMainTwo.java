package lesson3.calculator;

import lesson3.calculator.Calculator;

public class CalculatorMainTwo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 4;
        double b = 5;

        double result = calculator.sum(a, b);
        System.out.println("Sum: " + result);

        result = calculator.subtract(a, b);
        System.out.println("Subtract: " + result);

        result = calculator.multiply(a, b);
        System.out.println("Multiply: " + result);

        result = calculator.divide(a, b);
        System.out.println("Divide: " + result);
    }
}
