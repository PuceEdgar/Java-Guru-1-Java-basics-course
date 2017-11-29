package lesson6.homework;

import java.util.Random;
import java.util.Scanner;

public class SwapArrayNumbers {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userNumber;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        while (true) {
            System.out.println("Enter a number from 0 to 100: ");
            userNumber = scanner.nextInt();
            if (userNumber >= 0 && userNumber <= 100) {
                break;
            }
        }




        for (int i = 0; i < array.length; i++) {
            if (array[i] < userNumber) {
                array[i] = userNumber;
            }

        }

        System.out.println("New array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
