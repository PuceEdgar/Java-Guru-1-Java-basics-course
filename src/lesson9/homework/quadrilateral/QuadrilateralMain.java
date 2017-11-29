package lesson9.homework.quadrilateral;

import java.util.ArrayList;
import java.util.List;

public class QuadrilateralMain {

    public static void main(String[] args) {

        List<Quadrilateral> quadrilaterals = new ArrayList<>();
        int areaSum = 0;
        int perimeterAvg = 0;

        Parallelogram parallelogram = new Parallelogram(2,4);
        Rhombus rhombus = new Rhombus(3,6);
        Rectangle rectangle = new Rectangle(4,8);
        Square square = new Square(5);


        quadrilaterals.add(parallelogram);
        quadrilaterals.add(rhombus);
        quadrilaterals.add(rectangle);
        quadrilaterals.add(square);

        for (int i = 0; i < quadrilaterals.size(); i++) {
            areaSum += quadrilaterals.get(i).getArea();
        }

        for (int i = 0; i < quadrilaterals.size(); i++) {
            perimeterAvg += quadrilaterals.get(i).getPerimeter();
        }

        System.out.println("Area Sum: " + areaSum);
        System.out.println("Average perimeter: " + perimeterAvg/4);
    }
}
