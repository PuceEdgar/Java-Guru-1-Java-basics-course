package lesson2.calculator;

import java.util.Scanner;

public class Operation {

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose your operation:");
        System.out.println("1 - sum");
        System.out.println("2 - subtract");
        System.out.println("3 - multiply");
        System.out.println("4 - divide");
        System.out.print("Your option: ");
        int operation = scanner.nextInt();

        Calculator calculator = new Calculator();

        while (true) {
            if (operation == 1) {
                calculator.sum();
                break;
            }

            if (operation == 2) {
                calculator.subtract();
                break;
            }

            if (operation == 3) {
                calculator.multiply();
                break;
            }

            if (operation == 4) {
                calculator.divide();
                break;
            }
        }
    }
}
