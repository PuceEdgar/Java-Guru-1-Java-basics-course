package lesson6;

import java.util.Scanner;

public class IntArrayFilledByUser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to input? : ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Input %d number : ", i + 1);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d = %d\n", i + 1, numbers[i]);
        }

    }
}
