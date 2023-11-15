package ru.itis.examples.finalexample;

public class FinalExample {
    public static void main(String[] args) {
        final B object = new B();
        object.x = 10;

        System.out.println(object.x);

        object.x = 20;

        System.out.println(object.x);
    }
}
