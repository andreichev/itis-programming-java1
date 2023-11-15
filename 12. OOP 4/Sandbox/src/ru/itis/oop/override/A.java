package ru.itis.oop.override;

public class A {
    protected int x;
    protected int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int func() {
        return x + y;
    }
}
