package lesson6;

import java.util.Scanner;

public class ArrayUtilitiesTest2 {

    public static void main(String[] args) {

        int[] numbers = new int[0];
        boolean doContinue = true;
        Scanner scanner = new Scanner(System.in);
        ArrayUtilities utilities = new ArrayUtilities();
        int i = 0;
        do {

            String userChoice = "";
            while (!userChoice.equals("Y") && !userChoice.equals("N")) {
                System.out.println("Continue Y/N ? : ");
                userChoice = scanner.next();
            }

            if (userChoice.equals("N")) {
                doContinue = false;
            } else {
                if (numbers.length < i + 1) {
                    numbers = utilities.resize(numbers, i + 1);
                }
                System.out.print("Input number : ");
                numbers[i] = scanner.nextInt();
            }
            i++;
        } while (doContinue);
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }
}
