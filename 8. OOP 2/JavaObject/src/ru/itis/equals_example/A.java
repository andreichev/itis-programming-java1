package ru.itis.equals_example;

public class A {
    int x;

    public A(int x) {
        this.x = x;
        System.out.println("Constructor A");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return x == a.x;
    }

    @Override
    public int hashCode() {
        return x;
    }
}
