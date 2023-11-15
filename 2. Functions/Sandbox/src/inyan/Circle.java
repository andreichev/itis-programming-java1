package inyan;

public class Circle {
    Vector2 center;
    double radius;

    public Circle(double x, double y, double radius) {
        this.center = new Vector2(x, y);
        this.radius = radius;
    }

    public Circle(Vector2 center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    boolean isPointInside(Vector2 point) {
        return center.distance(point) <= radius;
    }
}
