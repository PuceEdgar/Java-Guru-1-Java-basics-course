package lesson3.LightColorDetector;

import java.util.Scanner;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wave length: ");
        int waveLength = scanner.nextInt();

        LightColorDetector lightColorDetector = new LightColorDetector();
        lightColorDetector.detect(waveLength);
    }
}
