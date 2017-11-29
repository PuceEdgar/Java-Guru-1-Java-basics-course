package lesson9.shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle:\nradius = " + radius + ", x = " + getCoordinates().getX() + ", y = " + getCoordinates().getY()+ "\n"
                + "Area = " + getArea() + "\n"
                + "Perimeter = " + getPerimeter();
    }
}
