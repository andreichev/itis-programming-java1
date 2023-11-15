package ru.itis.oop.override;

public class B extends A {
    public B() {
        this(1, 2);
    }

    public B(int x, int y) {
        super(x, y);
    }

    @Override
    int func() {
        return 2 * (x + y);
    }
}
