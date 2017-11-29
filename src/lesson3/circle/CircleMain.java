package lesson3.circle;

import lesson3.circle.Circle;

public class CircleMain {

    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        firstCircle.radius = 4;
        firstCircle.coordinateX = 10;
        firstCircle.coordinateY = 20;

        Circle secondCircle = new Circle();
        secondCircle.radius = 23;
        secondCircle.coordinateX = 40;
        secondCircle.coordinateY = 40;


        double area = firstCircle.getArea();
        System.out.println(area);

        double distance = firstCircle.getDistance(secondCircle);
        System.out.println(distance);
    }


}
