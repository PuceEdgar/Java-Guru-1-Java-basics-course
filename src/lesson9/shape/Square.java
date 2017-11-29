package lesson9.shape;


public class Square extends Shape {

    private double side;

    public Square(double side, int x, int y) {
        //super has to be first!
        super(x, y);
        //this has to be AFTER super!
        this.side = side;
    }



    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square:\nside = " + side + ", x = " + getCoordinates().getX() + ", y = " + getCoordinates().getY() + "\n"
                + "Area = " + getArea() + "\n"
                + "Perimeter = " + getPerimeter();
    }
}
