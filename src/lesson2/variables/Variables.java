package lesson2.variables;

public class Variables {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = a + b;


        System.out.println(c); //always prints out value as a String
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + c);

        c = c + 1;
        System.out.println("c = c + 1 -> " + c);

        c = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + c);

        c = Integer.MAX_VALUE + 1;
        System.out.println("Integer.MAX_VALUE + 1 = " + c);
    }

}
