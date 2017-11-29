package lesson3.various;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("Choose an option: ");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");

        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();

        if (option.equals("1")) {
            System.out.println("You've chosen 1");
        } else if (option.equals("2")) {
            System.out.println("You've chosen 2");
        } else if (option.equals("3")){
            System.out.println("You've chosen 3");
        } else {
            System.out.println("No such option!");
        }
    }
}
