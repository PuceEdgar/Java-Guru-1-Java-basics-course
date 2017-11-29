package lesson2.variables;

public class BooleanVariable {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        boolean c = a < b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a < b --> " + c);

        a = 3;
        b = 4;
        c = (a != b) && (a < b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a != b && a < b  --> " + c);
    }
}
