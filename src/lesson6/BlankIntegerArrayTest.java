package lesson6;

public class BlankIntegerArrayTest {

    public static void main(String[] args) {

        Integer[] blankArray = new Integer[10];

        for (int i = 0; i < blankArray.length; i++) {
            System.out.printf("blankArray[%d] = %d\n", i, blankArray[i]);
        }
    }
}
