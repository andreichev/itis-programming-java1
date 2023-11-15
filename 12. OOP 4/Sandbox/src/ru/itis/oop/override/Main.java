package ru.itis.oop.override;

public class Main {
    public static void main(String[] args) {
        A object = new B(2, 2);
        System.out.println(object.func());
    }
}
