package lesson10.staticVariable;

public class Dog {

    public static int count = 0;

    private String name;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
