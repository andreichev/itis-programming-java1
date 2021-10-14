package ru.itis.example3;

import ru.itis.example1.Vector2;

public class Rectangle {
    Vector2 position;
    double width;
    double height;
    char symbol;

    public Rectangle(double x, double y, double width, double height, char symbol) {
        position = new Vector2(x, y);
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }

    public Rectangle(Vector2 position, double width, double height, char symbol) {
        this.position = position;
        this.width = width;
        this.height = height;
        this.symbol = symbol;
    }

    boolean isPointInside(Vector2 point) {
        return point.x >= position.x && point.x <= position.x + width
                && point.y >= position.y && point.y <= position.y + height;
    }
}
