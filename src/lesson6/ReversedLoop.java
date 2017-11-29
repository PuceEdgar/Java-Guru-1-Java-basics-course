package lesson6;

public class ReversedLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;

        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

    }
}
