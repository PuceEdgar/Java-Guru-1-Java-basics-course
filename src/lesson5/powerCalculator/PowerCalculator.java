package lesson5.powerCalculator;

public class PowerCalculator {

    public double calculate(double value, int power ) {
        if (power == 0) {
            return 1;
        }
        if (power > 0) {
            return calculatePower(value, power);
        }
        return 1.0 / calculatePower(value, power);
    }

    private double calculatePower(double value, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= value;
        }
        return result;
    }
}
