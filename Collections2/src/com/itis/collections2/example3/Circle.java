package com.itis.collections2.example3;

public class Circle implements Figure {
    double radius;
    Vector2 center;
    char symbol;

    Circle(double radius, double x, double y, char symbol) {
        center = new Vector2(x, y);
        this.radius = radius;
        this.symbol = symbol;
    }

    @Override
    public boolean isPointInside(Vector2 point) {
        double distance = point.distance(center);
        return distance <= radius;
    }

    @Override
    public char getSym() {
        return symbol;
    }
}
