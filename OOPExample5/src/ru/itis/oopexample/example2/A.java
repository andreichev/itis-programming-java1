package ru.itis.oopexample.example2;

public class A {
    int x;

    public A(int x) {
        this.x = x;
    }

    protected void increase() {
        x++;
    }

    int getX() {
        return x;
    }

    void printX() {
        System.out.println(x);
    }
}
