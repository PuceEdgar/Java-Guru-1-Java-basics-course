package lesson10.visibility;

public class ClassB {

    private static int number;

    //static belongs to class!
    private static void setNumber(int number){
        ClassB.number = number;

        //this won't work because object is not created yet
        //this.number = number;
    }

    private String name;

    public ClassB(String name) {
        this.name = name;
    }

    //belongs to object!
    public void setNumber(){
        ClassB.number = 1;
        this.number = 1;
        ClassB.setNumber(1);
    }
}
