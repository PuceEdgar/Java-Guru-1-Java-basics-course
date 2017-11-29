package lesson6.homework;

import java.util.Random;

public class MaxNumberIndexZero {

    public static void main(String[] args) {


        int[] array = new int[10];
        Random random = new Random();
        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
                index = i;
            }

        }

        array[index] = array[0];
        array[0] = max;

        System.out.println("Changed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
