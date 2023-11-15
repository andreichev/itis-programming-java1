package ru.itis.university.S.bad;

import ru.itis.university.common.Vector2;

public class Figure {
    public enum Type {
        CIRCLE,
        RECT
    }

    double radius;
    Vector2 center;
    char symbol;
    Vector2 position;
    double width;
    double height;
    Type type;

    static Figure makeRect(double x, double y, double width, double height, char symbol) {
        Figure figure = new Figure();
        figure.position = new Vector2(x, y);
        figure.width = width;
        figure.height = height;
        figure.symbol = symbol;
        figure.type = Type.RECT;
        return figure;
    }

    static Figure makeCircle(double radius, double x, double y, char symbol) {
        Figure figure = new Figure();
        figure.center = new Vector2(x, y);
        figure.radius = radius;
        figure.symbol = symbol;
        figure.type = Type.CIRCLE;
        return figure;
    }

    public boolean isPointInside(Vector2 point) {
        switch (type) {
            case RECT:
                return isPointInsideRect(point);
            case CIRCLE:
                return isPointInsideCircle(point);
        }
        return false;
    }

    private boolean isPointInsideRect(Vector2 point) {
        return point.x >= position.x && point.x <= position.x + width
                && point.y >= position.y && point.y <= position.y + height;
    }

    private boolean isPointInsideCircle(Vector2 point) {
        double distance = point.distance(center);
        return distance <= radius;
    }

    public char getSym() {
        return symbol;
    }
}
