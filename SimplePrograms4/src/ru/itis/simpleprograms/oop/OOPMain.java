package ru.itis.simpleprograms.oop;

public class OOPMain {
    public static void main(String[] args) {
        IsoscelesTriangle triangle1 = new IsoscelesTriangle(
                new Point(0f, 0f),
                new Point(2f, 0f),
                new Point(1f, 3f)
        );

        IsoscelesTriangle triangle2 = new IsoscelesTriangle(
                new Point(4f, 0f),
                new Point(2f, 4f),
                new Point(6f, 4f)
        );

        System.out.println(triangle1.equals(triangle2));
    }
}
