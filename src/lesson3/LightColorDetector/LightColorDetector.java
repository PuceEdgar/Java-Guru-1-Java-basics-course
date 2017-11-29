package lesson3.LightColorDetector;

public class LightColorDetector {

    void detect(int waveLength) {



        if (380 <= waveLength && waveLength < 450) {
            System.out.println("Light color is purple.");
        } else if (450 <= waveLength && waveLength < 495) {
            System.out.println("Light color is blue.");
        } else if (495 <= waveLength && waveLength < 570) {
            System.out.println("Light color is green");
        } else if (570 <= waveLength && waveLength < 590) {
            System.out.println("Light color is yellow");
        } else if (590 <= waveLength && waveLength < 620) {
            System.out.println("Light color is orange");
        } else if (620 <= waveLength && waveLength <= 750) {
            System.out.println("Light color is red");
        } else {
            System.out.println("Light is not visible!");
        }


    }
}
