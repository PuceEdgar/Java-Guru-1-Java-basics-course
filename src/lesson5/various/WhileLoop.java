package lesson5.various;

public class WhileLoop {

    public static void main(String[] args) {

        System.out.println("--for loop--");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("while loop");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("do...while loop");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }
}
