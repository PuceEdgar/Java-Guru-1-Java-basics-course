package lesson6.homework;

import java.util.Random;

public class ReversedArray {

    public static void main(String[] args) {

        int[] array = new int[10];
        int[] reversedArray = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reversedArray[i] = array[j];
        }

        System.out.println("Reversed Array:");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }
}
