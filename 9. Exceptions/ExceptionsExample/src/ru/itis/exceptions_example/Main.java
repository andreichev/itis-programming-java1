package ru.itis.exceptions_example;

public class Main {
    public static void main(String[] args) throws TiLohException {
        LohChecker checker = new LohChecker();
        checker.check();
    }
}
