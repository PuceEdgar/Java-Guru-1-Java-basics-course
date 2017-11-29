package lesson2;

import com.sun.xml.internal.bind.v2.runtime.output.XMLStreamWriterOutput;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        String name = "teddy@est.lv@";
        String[] test = name.split("@",2);
        if (test[1].contains("@")) {
            System.out.println("error");
        }
        System.out.println("string 1 " + test[0]);
        System.out.println("string 2 " + test[1]);
        System.out.println("string 3 " + test[2]);

    }
}
