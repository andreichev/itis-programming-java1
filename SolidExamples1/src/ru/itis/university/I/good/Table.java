package ru.itis.university.I.good;

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
}
