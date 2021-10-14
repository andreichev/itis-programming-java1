package ru.itis.example1;

public class Vector2 {
    double x;
    double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Vector2 other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }
}
