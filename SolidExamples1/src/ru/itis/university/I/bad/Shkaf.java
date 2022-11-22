package ru.itis.university.I.bad;

public class Shkaf implements Furniture {
    String color;
    boolean isOpened;

    public Shkaf(String color) {
        this.color = color;
        isOpened = false;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void open() {
        isOpened = true;
    }

    @Override
    public void close() {
        isOpened = false;
    }
}
