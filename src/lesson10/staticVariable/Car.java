package lesson10.staticVariable;

public class Car {

    public static final int MAX_SPEED = 200;
    private String color;
    private String model;
    private int speed;

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public void accelerate(){
        if (speed < MAX_SPEED) {
            speed += 10;
        }
    }

    public int getSpeed(){
        return speed;
    }
}
