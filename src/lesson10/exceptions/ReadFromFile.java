package lesson10.exceptions;

import java.io.*;

public class ReadFromFile {

    public static void main(String[] args) {

        File file = new File("/Users/edgarspuce/Desktop/java_code/Javaguru Java 1/src/lesson10/exceptions/exceptions.txt");

        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            //reads one symbol/letter at a time
            fileReader = new FileReader(file);
            //collects whole line from FileReader until line break \n
            reader = new BufferedReader(fileReader);
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
        finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException ignore) {

            }

        }
    }
}
