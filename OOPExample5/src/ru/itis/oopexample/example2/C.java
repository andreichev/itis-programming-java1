package ru.itis.oopexample.example2;

import ru.itis.oopexample.example2.A;

public class C extends A {

    public C(int x) {
        super(x);
    }

    @Override
    public String toString() {
        return String.valueOf(x);
    }
}
