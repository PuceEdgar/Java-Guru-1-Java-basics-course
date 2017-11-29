package lesson6;

public class SwapElements {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 13;

        int tmp = numbers[0];
        numbers[0] = numbers[2];
        numbers[2] = tmp;

        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
    }
}
