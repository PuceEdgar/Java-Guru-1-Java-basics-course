package lesson3.DogAgeCalculator;

public class DogAgeCalculator {

    int toHumanAge(int dogAge) {
        int age = 0;

        if (dogAge == 1) {
            age = 15;
        }

        if (dogAge == 2) {
            age = 24;
        }

        if (dogAge >= 3) {
            age = 24 + (dogAge - 2) * 4;
        }


        return age;
    }

    int toDogAge(int humanAge) {
        int age = 0;

        if (15 <= humanAge && humanAge < 24 ) {
            age = 1;
        }

        if (24 <= humanAge && humanAge < 28) {
            age = 2;
        }

        if (humanAge >= 28) {
            age = 2 + (humanAge - 24) / 4;
        }

        return age;
    }
}
