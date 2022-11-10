package com.itis.oopexample.sandbox;

public class Sandbox {
    public static void main(String[] args) {
        A object = new A() {
            @Override
            void func() {
                System.out.println("HELLO!");
            }
        };

        object.func();
    }
}
