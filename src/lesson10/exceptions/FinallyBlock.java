package lesson10.exceptions;

import java.util.Random;

public class FinallyBlock {

    public static void main(String[] args) {

        Random random = new Random();
        try {
            if (random.nextBoolean()) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException e){
            System.err.println("exception error");
        }
        finally {
            System.out.println("finally");
        }
    }
}
