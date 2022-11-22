package ru.itis.university.I.bad;

public class Table implements Furniture {
    String color;
    int height;
    int width;

    public Table(String color, int height, int width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void open() {
        throw new RuntimeException("Cannot be implemented");
    }

    @Override
    public void close() {
        throw new RuntimeException("Cannot be implemented");
    }
}
