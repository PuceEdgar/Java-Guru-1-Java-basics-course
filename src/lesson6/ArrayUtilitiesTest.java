package lesson6;

public class ArrayUtilitiesTest {

    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 30;
        array[1] = -50;
        array[2] = 200;
        array[3] = 64;
        array[4] = 10;

        ArrayUtilities utilities = new ArrayUtilities();

        int max = utilities.max(array);
        double average = utilities.average(array);

        System.out.println("max = " + max);
        System.out.println("average = " + average);

    }
}
