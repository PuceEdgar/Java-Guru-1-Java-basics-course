package lesson10.staticMethods;

public final class MathUtils {

    //won't allow to create MathUtils objects
    private MathUtils(){};

    public static double power(double value, double power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= value;
        }

        return result;
    }
}
