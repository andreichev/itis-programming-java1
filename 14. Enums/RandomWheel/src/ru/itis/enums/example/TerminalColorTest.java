package ru.itis.enums.example;

import java.util.Scanner;

public class TerminalColorTest {
    static String toString(double x, int p) {
        StringBuilder result = new StringBuilder();
        int z = (int) x;
        result.append(z);
        result.append(".");
        x -= z;
        x *= 10;
        for (int i = 0; i < p; i++) {
            result.append((int) x % 10);
            x *= 10;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        double x = 34.12345678999;
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        System.out.printf(toString(x, p));
    }
}
