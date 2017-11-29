package lesson7;

public class PrimitivesVsObjects {

    public static void main(String[] args) {

        int a = 4;
        int b = 4;

        a = b;
        b++;

        System.out.println("b = " + b + " a = " + a);

        Cat barsik = new Cat();
        barsik.setName("barsik");

        Cat murzik = new Cat();
        murzik.setName("murzik");

        murzik = barsik;

        System.out.println("barsik = " + barsik.getName());
        System.out.println("murzik = " + murzik.getName());

        murzik.setName("Terminator");

        System.out.println("barsik = " + barsik.getName());
        System.out.println("murzik = " + murzik.getName());
    }
}
