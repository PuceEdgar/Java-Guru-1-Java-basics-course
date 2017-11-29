package lesson9.exceptions;

import java.io.*;

public class OpenFile {

    public static void main(String[] args) {

        File file = new File("/Users/edgarspuce/Desktop/test.txt");
        try {
            //FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader getInfo = new BufferedReader(new FileReader(file));
            String custInfo = getInfo.readLine();

            while (custInfo != null) {
                System.out.println(custInfo);
                custInfo = getInfo.readLine();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("file doesn't exist!");
        }
        catch (IOException e) {
            System.out.println("IO error");
        }
    }
}
