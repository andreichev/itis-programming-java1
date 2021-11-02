package ru.kfu.itis.example1;

public abstract class B implements A {
    @Override
    public void f1() {
        System.out.println(1);
    }

    @Override
    public void f3() {
        System.out.println(3);
    }
}
