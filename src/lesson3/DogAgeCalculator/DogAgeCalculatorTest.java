package lesson3.DogAgeCalculator;

import java.util.Scanner;

public class DogAgeCalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dog age: ");
        int dogAgeInput = scanner.nextInt();
        System.out.println("Enter human age: ");
        int humanAgeInput = scanner.nextInt();

        DogAgeCalculator dogAgeCalculator = new DogAgeCalculator();
        int humanAge = dogAgeCalculator.toHumanAge(dogAgeInput);
        System.out.println("If dog age is " + dogAgeInput + ", human age is: " + humanAge);

        int dogAge = dogAgeCalculator.toDogAge(humanAgeInput);
        System.out.println("If human age is " + humanAgeInput + ", dog age is: " + dogAge);
    }
}
