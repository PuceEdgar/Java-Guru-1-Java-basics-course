package lesson6;

import java.util.ArrayList;
import java.util.List;

public class JavaSETest {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        System.out.println(elements);
        elements.add(10);
        elements.add(30);
        System.out.println(elements);
        int firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
    }


}
