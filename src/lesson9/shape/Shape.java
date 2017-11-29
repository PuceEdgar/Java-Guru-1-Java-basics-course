package lesson9.shape;

public abstract class Shape {

    private Coordinates coordinates;

    public abstract double getArea();
    public abstract double getPerimeter();

    public Shape(int x, int y) {
        this.coordinates = new Coordinates(x ,y);
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void move(int x, int y){
        coordinates.setX(coordinates.getX() + x);
        coordinates.setY(coordinates.getY() + y);
    }


}
