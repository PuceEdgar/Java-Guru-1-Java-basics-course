package lesson5.various;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = "";

        do {
            System.out.println("1. Print hello");
            System.out.println("2. exit");
            System.out.println("Your choice: ");
            userChoice = scanner.next();
            if (userChoice.equals("1")) {
                System.out.println("hello!");
            }
        } while (!userChoice.equals("2"));
    }
}
