package ru.itis.university.L.good;

public class Rectangle implements Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setSide(int x) {
        setWidth(x);
    }

    @Override
    public int getSquare() {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
