package lesson6.homework;

import java.util.Random;
import java.util.Scanner;

public class ChosenRange {

    public static void main(String[] args) {

        int[] array = new int[10];
        int k = 0;
        int startRange;
        int endRange;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        while (true) {
            System.out.println("Enter your range from 0 to 100: ");
            startRange = scanner.nextInt();
            endRange = scanner.nextInt();
            if (startRange >= 0 && startRange <= 100) {
                if (endRange >= 0 && endRange <= 100) {
                    if (startRange < endRange) {
                        break;
                    }
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            if (array[i] >= startRange && array[i] <= endRange) {
                k += 1;
            }
        }



        int[] newArray = new int[k];

        for (int i = 0, j = 0; j < k && i < array.length; i++) {
            if (array[i] >= startRange && array[i] <= endRange) {
                newArray[j] = array[i];
                j += 1;
            }

        }
        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}