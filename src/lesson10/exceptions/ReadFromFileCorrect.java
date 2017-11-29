package lesson10.exceptions;

import java.io.*;

public class ReadFromFileCorrect {

    public static void main(String[] args) {

        File file = new File("/Users/edgarspuce/Desktop/java_code/Javaguru Java 1/src/lesson10/exceptions/exceptions.txt");


        try (   //only auto closable classes can be used inside try!
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader)
        ) {

            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
