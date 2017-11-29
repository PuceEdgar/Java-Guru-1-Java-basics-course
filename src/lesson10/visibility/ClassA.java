package lesson10.visibility;

public class ClassA {

    private int number;

    private static void staticMethod(){
        //object fields can not be seen because object doesnt exist yet
        //number = 3;
        //this.number = 4;
    }



    public ClassA(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //object is created so it's methods can be seen
    public void objectMethod(){
        staticMethod();
    }
}
