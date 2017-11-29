package lesson2.human;

public class HumanMain {

    public static void main(String[] args) {
        Human Ted = new Human();
        Ted.name = "Ted";
        Ted.age = 21;
        Ted.sayHi();

        Human Jack = new Human();
        Jack.name = "Jack";
        Jack.age = 37;
        Jack.sayHi();

        Jack.name = "Jack Sparrow";
        Jack.sayHi();
    }
}
