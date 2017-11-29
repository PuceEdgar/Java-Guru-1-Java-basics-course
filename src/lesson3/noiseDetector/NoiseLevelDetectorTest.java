package lesson3.noiseDetector;

import java.util.Scanner;

public class NoiseLevelDetectorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dB level: ");

        int level = scanner.nextInt();

        NoiseLevelDetector detector = new NoiseLevelDetector();
        String detected = detector.detect(level);

        System.out.println("Noise level name = " + detected);
    }
}
