package ru.itis.examples.example1;

public class Example1 {
    public static void main(String[] args) {
        int[] x = new int[1];
        x[0] = 10;

        try {
            System.out.println(x[5]);
        } catch (Exception object) {
            System.out.println(object.getMessage());
        }

        System.out.println("END!");
    }
}
