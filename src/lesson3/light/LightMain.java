package lesson3.light;

public class LightMain {

    public static void main(String[] args) {
        boolean test;


        LightBulb lightBulb = new LightBulb();
        LightSwitch lightSwitch = new LightSwitch();

        lightSwitch.connect(lightBulb);

        lightSwitch.switchOn();
        lightSwitch.switchOff();

        lightSwitch.switchOn();
        lightSwitch.switchOff();

        lightSwitch.switchOn();
        lightSwitch.switchOff();

        lightSwitch.switchOn();
        lightSwitch.switchOff();

        lightSwitch.switchOn();
        lightSwitch.switchOff();

        lightSwitch.switchOn();
        lightSwitch.switchOff();
    }
}
