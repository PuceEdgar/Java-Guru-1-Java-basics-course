package lesson2.variables;

public class PrimitiveWrappers {

    public static void main(String[] args) {
        Integer a = new Integer(5); // creating new object
        Integer b = new Integer(5);


        boolean result = a == b; // cannot compare 2 objects!!! always result will be false!
        System.out.println("a == b --> " + result);

        boolean result2 = a.equals(b); // comparing objects if they are equal
        System.out.println("a.equals(b) --> " + result2);

        Integer fromString = Integer.parseInt("5");
        System.out.println("from string --> " + fromString);

    }
}
