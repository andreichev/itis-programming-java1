package ru.itis.university.L.good;

public class Square implements Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setSide(int x) {
        setA(x);
    }

    @Override
    public int getSquare() {
        return a * a;
    }

    @Override
    public int getPerimeter() {
        return a * 4;
    }
}
