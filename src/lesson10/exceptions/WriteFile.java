package lesson10.exceptions;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {

        File file = new File("/Users/edgarspuce/Desktop/java_code/Javaguru Java 1/src/lesson10/exceptions/exceptions.txt");


        try (   //only auto closable classes can be used inside try!
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {

            String line = "I wrote to file";
            writer.append(line);

        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
