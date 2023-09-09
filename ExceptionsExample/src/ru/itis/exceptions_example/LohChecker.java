package ru.itis.exceptions_example;

public class LohChecker {
    void check() throws TiLohException {
        if (Math.random() > 0.5) {
            throw new TiLohException();
        } else {
            System.out.println("Сам ты лох");
        }
    }
}
