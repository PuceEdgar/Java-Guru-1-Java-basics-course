package lesson9.animals;

public abstract class Animal {

    private int weight;
    private int age;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //abstract method has no body!
    public abstract void speak();
}
