package lesson3.various;

import java.util.Scanner;

public class PlusOrMinus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive!");
        } else if (number < 0){
            System.out.println("Your number is negative!");
        } else {
            System.out.println("0 is not Positive nor Negative!");
        }
    }
}
