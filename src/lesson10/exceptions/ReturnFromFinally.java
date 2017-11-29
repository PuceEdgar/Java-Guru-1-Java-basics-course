package lesson10.exceptions;

import java.util.Random;

public class ReturnFromFinally {

    public static void main(String[] args) {
        int number = getNumber();
        System.out.println("number = " + number);
    }

    public static int getNumber(){
        Random random = new Random();

        try {
            if (random.nextBoolean()) {
                throw new RuntimeException();
            }
            return 100;
        }
        catch (RuntimeException e) {
            return 200;
        }
        //never use finally to return value, because it will run every time!
        finally {
            return 300;
        }
    }
}
