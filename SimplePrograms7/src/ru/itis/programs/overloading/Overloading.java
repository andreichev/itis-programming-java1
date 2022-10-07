package ru.itis.programs.overloading;

public class Overloading {
    static void print(int x) {
        System.out.println("FUNC 1");
        System.out.println(x);
    }

    static void print(float x) {
        System.out.println("FUNC 2");
        System.out.println(x);
    }

    static void print(double x) {
        System.out.println("FUNC 3");
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        print(x + y);
    }
}
