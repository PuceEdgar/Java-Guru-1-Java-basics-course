package lesson3.calculator;

import lesson3.calculator.Calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Choose your operation:");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        String option = scanner.next();


        Calculator calculator = new Calculator();
        double resultDivide = calculator.divide(num1, num2);
        double resultSum = calculator.sum(num1, num2);
        double resultSubtract = calculator.subtract(num1, num2);
        double resultMultiply = calculator.multiply(num1, num2);


        if (option.equals("1")) {
            System.out.println("Sum result: " + resultSum);
        } else if (option.equals("2")) {
            System.out.println("Subtraction result: " + resultSubtract);
        } else if (option.equals("3")) {
            System.out.println("Multiply result: " + resultMultiply);
        } else if (option.equals("4")) {
            System.out.println("Division result: " + resultDivide);
        } else {
            System.out.println("There is no option: " + option);
        }


    }
}
