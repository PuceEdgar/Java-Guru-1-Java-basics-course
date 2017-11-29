package lesson3.noiseDetector;

public class NoiseLevelDetector {

    String detect(int level) {

        String result = null;


        if (level >= 130) {
            return "Jackhammer";
        }

        if (level >= 70 && level < 130) {
            return "Gas lawnmower";
        }

        if (level >= 40 && level < 70) {
            return "Alarm Clock";
        }

        if (level < 40) {
            return "Quiet room";
        }

        return result;
    }
}
