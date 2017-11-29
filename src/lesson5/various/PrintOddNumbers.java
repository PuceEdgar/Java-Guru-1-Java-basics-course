package lesson5.various;

public class PrintOddNumbers {

    public static void main(String[] args) {

        int from = 1;
        int to = 9;
        int oddCount = 0;

        for (int i = from; i < to; i++) {

            if (i % 2 == 0) {
                oddCount++;
                System.out.println(i);
            }

        }

        System.out.println("odd count: " + oddCount);
    }
}
