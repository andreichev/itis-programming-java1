package ru.itis.acces_modifiers_example.package1;

public class A {
    int x;

    public static class B {
        public B() {}
        void func1() {

        }
    }

    private void func0() {
        System.out.println("HELLO " + x);
    }

    public A(int x) {
        this.x = x;
        B b = new B();
        b.func1();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() == o.getClass()) return false;

        A a = (A) o;

        return x == a.x;
    }
}
