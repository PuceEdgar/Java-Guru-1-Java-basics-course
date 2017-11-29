package lesson9.homework.quadrilateral;

public class Parallelogram extends Quadrilateral {

    private int length;
    private int width;

    public Parallelogram(){
    };

    public Parallelogram(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int getArea() {
         return length * width;
    }

    @Override
    public int getPerimeter() {
        return  (length+width) * 2;
    }
}
