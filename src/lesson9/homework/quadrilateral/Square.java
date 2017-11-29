package lesson9.homework.quadrilateral;

public class Square extends Rectangle {


    private int width;

    public Square(int width){
        this.width = width;
    };

    @Override
    public int getArea() {
        return width*width;
    }

    @Override
    public int getPerimeter() {
        return width * 4;
    }
}
