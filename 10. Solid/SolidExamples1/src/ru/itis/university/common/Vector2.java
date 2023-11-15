package ru.itis.university.common;

public class Vector2 {
    public double x;
    public double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Vector2 other) {
        return Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }
}
