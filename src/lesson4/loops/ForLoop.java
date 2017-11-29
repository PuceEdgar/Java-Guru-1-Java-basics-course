package lesson4.loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("All numbers:");
        if (firstNumber >= 0) {
            for (int i = 0; i <= firstNumber; i++) {
                System.out.println(i);
            }
        }

        System.out.println("Even numbers");
        if (firstNumber >= 0) {
            for (int i = 0; i <= firstNumber; i+=2) {
                System.out.println(i);
            }
        }

        System.out.println("Descending order:");
        if (firstNumber >= 0) {
            for (int i = firstNumber; i >= 0; i--) {
                System.out.println(i);
            }
        }

    }
}
