package lesson6.homework;

import java.util.Random;
import java.util.Scanner;

public class SameArrayReversed {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        for (int i = 0, j = array.length-1; i < array.length/2; i++, j--) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }

        System.out.println("Reversed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
