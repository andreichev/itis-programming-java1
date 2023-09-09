package ru.itis.simpleprograms.oop;

public class Point {
    private final float x;
    private final float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Point other) {
        return (float) Math.sqrt((x - other.x) * (x - other.x) + (y - other.y) * (y - other.y));
    }
}
