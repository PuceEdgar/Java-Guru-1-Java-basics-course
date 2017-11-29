package lesson10.staticMethods;

public class Parallelogram {

    private double sideA;
    private double sideB;
    private double height;

    public Parallelogram(double sideA, double sideB, double height) {
        if (sideA < height) {
            throw new RuntimeException("side a must be greater than height!");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;

    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }
}
