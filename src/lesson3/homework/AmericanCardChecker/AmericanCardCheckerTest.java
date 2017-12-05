package lesson3.AmericanCardChecker;

import java.util.Scanner;

public class AmericanCardCheckerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String firstCardNumber = scanner.nextLine();
        String secondCardNumber = scanner.nextLine();

        AmericanCardChecker americanCardChecker = new AmericanCardChecker();
        System.out.println(americanCardChecker.isAmerican("323456789101112"));
        System.out.println(americanCardChecker.isAmerican("343456789101112"));
        System.out.println(americanCardChecker.isAmerican("37345678910114444412"));
        System.out.println(firstCardNumber + americanCardChecker.isAmerican(firstCardNumber));
        System.out.println(secondCardNumber + americanCardChecker.isAmerican(secondCardNumber));
    }
}
