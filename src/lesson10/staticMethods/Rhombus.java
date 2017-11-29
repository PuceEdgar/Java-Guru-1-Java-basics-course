package lesson10.staticMethods;

public class Rhombus extends Parallelogram {

    private double longDiagonal;
    private double shortDiagonal;


    public Rhombus(double longDiagonal, double shortDiagonal) {
        super(
                countSide(longDiagonal, shortDiagonal),
                countSide(longDiagonal, shortDiagonal),
                countHeight(longDiagonal, shortDiagonal)
        );
        this.longDiagonal = longDiagonal;
        this.shortDiagonal = shortDiagonal;
    }

    private static double countHeight(double longDiagonal, double shortDiagonal){
        double area = (longDiagonal * shortDiagonal) / 2;
        double side = countSide(longDiagonal, shortDiagonal);
        return area/side;
    }

    private static double countSide(double longDiagonal, double shortDiagonal){
        double halfLong = longDiagonal/2;
        double halfShort = shortDiagonal/2;
        double squareSide = Math.pow(halfLong, 2) * Math.pow(halfShort, 2);
        return  Math.sqrt(squareSide);
    }
}
