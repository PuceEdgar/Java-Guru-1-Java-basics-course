package lesson5.various;

import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numsum = 0;
        System.out.println("Input numbers count: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter your number: ");
            numsum += scanner.nextInt();
        }

        System.out.println("Average: " + numsum/count);

    }
}
