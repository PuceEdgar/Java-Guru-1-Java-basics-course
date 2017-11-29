package lesson8.equalsTest;

public class PersonMain {

    public static void main(String[] args) {

        Person bob = new Person("bob", "nice", "123");
        Person ted = new Person("ted", "good", "123");
        Person bob2 = new Person("bob", "nice", "1234");



        //we decided that unique property is personal code only!
        //if two persons have same personal code then they are same!
        System.out.println(bob.equals(ted));
        System.out.println(bob.equals(bob2));

    }
}
