package lesson6.homework;

import java.util.Random;

public class RandomArraySum {

    public static void main(String[] args) {


        int[] array = new int[10];
        Random random = new Random();
        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            arraySum += array[i];

        }

        System.out.println("Array Sum: " + arraySum);
    }
}
