package triangle_perimeter_square;

//
public class TrianglePerimeterSquare {
    static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
    }

    static double getTrianglePerimeter(double aLength, double bLength, double cLength) {
        return aLength + bLength + cLength;
    }

    static double getTriangleArea(
            double aLength, double bLength, double cLength,
            double halfPerimeter
    ) {
        return Math.sqrt(halfPerimeter * (halfPerimeter - aLength) * (halfPerimeter - bLength) * (halfPerimeter - cLength));
    }

    public static void main(String[] args) {
        if(args.length < 6) {
            System.out.println("Please, enter triangle coordinates as arguments");
        }

        // Координаты первой точки треугольниука
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);

        // Координаты второй точки треугольниука
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Координаты третьей точки треугольниука
        double x3 = Double.parseDouble(args[4]);
        double y3 = Double.parseDouble(args[5]);

        double aLength = getDistance(x1, y1, x2, y2);
        double bLength = getDistance(x2, y2, x3, y3);
        double cLength = getDistance(x3, y2, x1, y1);

        double trianglePerimeter = getTrianglePerimeter(aLength, bLength, cLength);
        System.out.println("Triangle perimeter: " + trianglePerimeter);

        double triangleArea = getTriangleArea(aLength, bLength, cLength, trianglePerimeter / 2);
        System.out.println("Triangle area: " + triangleArea);
    }
}
