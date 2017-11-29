package lesson3.circle;

public class Circle {

    double radius;
    int coordinateX;
    int coordinateY;


    double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    double getDistance(Circle circle) {
        double catcheusX = Math.abs(coordinateX - circle.coordinateX);
        double catcheusY = Math.abs(coordinateY - circle.coordinateY);
        double squareHipothenuse = Math.pow(catcheusX, 2) + Math.pow(catcheusY, 2);
        double distance = Math.sqrt(squareHipothenuse);
        return distance;
    }
}


//Math
//abs() - changes 1 to -1 and -1 to 1
//pow() - power/stepenj
//random() - random number 0-1