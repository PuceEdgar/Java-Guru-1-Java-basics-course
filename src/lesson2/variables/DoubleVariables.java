package lesson2.variables;

public class DoubleVariables {

    public static void main(String[] args) {
        double a = 4.0;
        double b = 5;
        double c = a /b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a / b = " + c);

        c = 1 / 0.0;
        System.out.println("c = 1 / 0.0 = " + c);

        c = 5 / 3;
        System.out.println("c = 5 / 3 = " + c);

        c = 5.0 / 3.0;
        System.out.println("c = 5.0 / 3.0 = " + c);

        c = 0.1 + 0.1 + 0.1;
        System.out.println(c);

    }
}
