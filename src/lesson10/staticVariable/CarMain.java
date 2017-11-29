package lesson10.staticVariable;

public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("green", "Q7");
        car1.accelerate();
        System.out.println("car1 (object) speed = " + car1.getSpeed());
        System.out.println("Car (class) max speed = " + Car.MAX_SPEED);
    }
}
