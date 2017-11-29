package lesson10.staticVariable;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class DogMain {

    public static void main(String[] args) {

        System.out.println("Dog.count = " + Dog.count);

        Dog dog1 = new Dog("dog 1");
        Dog dog2 = new Dog("dog 2");

        System.out.println("dog1.count = " + dog1.count);
        System.out.println("dog2.count = " + dog2.count);
        System.out.println("Dog.count = " + Dog.count);

        Dog.count = -1;
        System.out.println("Dog.count = " + Dog.count);

    }


}
