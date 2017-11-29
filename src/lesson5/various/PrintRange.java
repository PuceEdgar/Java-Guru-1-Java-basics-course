package lesson5.various;

import java.util.Scanner;

public class PrintRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter from number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter to number: ");
        int secondNum = scanner.nextInt();

        for (int i = firstNum; i <= secondNum; i++) {
            System.out.println(i);
        }
    }
}
