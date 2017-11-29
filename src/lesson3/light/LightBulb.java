package lesson3.light;

public class LightBulb {

    int availableTurnOnCount = 5;
    boolean turnedOn;


    boolean canBeTurnedOn() {
        return availableTurnOnCount > 0;
    }

    void turnOn() {
        if (!turnedOn && canBeTurnedOn()) {
            availableTurnOnCount = availableTurnOnCount - 1;
            turnedOn = true;
            System.out.println("Light is ON");
        }
    }

    void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Light is OFF");
        }

    }


}
