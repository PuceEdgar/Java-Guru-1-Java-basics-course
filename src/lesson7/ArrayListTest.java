package lesson7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //adding elements

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //printing out elements

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
