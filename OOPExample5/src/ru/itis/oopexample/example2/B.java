package ru.itis.oopexample.example2;

public class B extends A {
    int y;

    public B(int y) {
        super(5);
        this.y = y;
    }

    @Override
    protected void increase() {
        super.increase();
        y++;
    }

    @Override
    public int getX() {
        increase();
        return x;
    }
}
