package lesson3.various;

import java.util.Scanner;

public class MaxOfTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("Greatest number is: " + num1);
        } else if (num2 > num1){
            System.out.println("Greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}
