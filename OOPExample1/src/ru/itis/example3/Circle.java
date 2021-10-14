package ru.itis.example3;

import ru.itis.example1.Vector2;

public class Circle {
    double radius;
    Vector2 center;
    char symbol;

    Circle(double radius, double x, double y, char symbol) {
        center = new Vector2(x, y);
        this.radius = radius;
        this.symbol = symbol;
    }

    boolean isPointInside(Vector2 point) {
        double distance = point.distance(center);
        return distance <= radius;
    }
}
