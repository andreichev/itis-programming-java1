package com.itis.oopexample.example1;

public class Example1 {
    static void print(int x, int y) {
        System.out.println("A");
        System.out.println(x + " " + y);
    }

    static void print(int x) {
        System.out.println("B");
        System.out.println(x);
    }

    static void print(String x) {
        System.out.println("C");
        System.out.println(x);
    }

    public static void main(String[] args) {
        print("10");
    }
}
