package lesson9.animals;

public class AnimalMain {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.speak();
        dog.speak();

        //Can't create abstract class!!
        //Animal animal = new Animal(); will show error!
    }
}
