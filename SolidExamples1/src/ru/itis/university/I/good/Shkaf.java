package ru.itis.university.I.good;

public class Shkaf implements ClosableFurniture {
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
