package lesson9.exceptions;

public class CheckedExceptions {

    public void method(){
        System.out.println("method");
        method1();
        System.out.println("method end");
    }

    public void method1(){
        System.out.println("method1");
        try{
            method2();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("method1 end");
    }

    public void method2() throws Exception{
        System.out.println("method2");
        throw new Exception();
    }

    public static void main(String[] args) {
        CheckedExceptions checkedExceptions = new CheckedExceptions();
        checkedExceptions.method();
    }
}
