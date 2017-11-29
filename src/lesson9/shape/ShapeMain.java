package lesson9.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(5, 10, 10));
        shapes.add(new Circle(10, 15, 5));

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i));
        }

        //user moved figures
        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).move(4, 5);
        }

        System.out.println("After Moving:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("new x = " + shapes.get(i).getCoordinates().getX() + ", new y = " + shapes.get(i).getCoordinates().getY());
        }
    }
}
