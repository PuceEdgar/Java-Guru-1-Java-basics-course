package lesson9.exceptions;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int fromUser = 0;
        boolean inputCorrect = false;

        while (!inputCorrect) {
            try{
                System.out.println("enter number");
                String number = scanner.nextLine();
                fromUser = Integer.parseInt(number);
                inputCorrect = true;
            }
            catch (NumberFormatException e) {
                System.out.println("wrong number");
            }
        }

        System.out.println("Your number: " + fromUser);
    }
}
