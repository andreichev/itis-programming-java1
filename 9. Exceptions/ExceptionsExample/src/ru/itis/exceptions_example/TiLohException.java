package ru.itis.exceptions_example;

public class TiLohException extends Exception {
    private final String message;

    public TiLohException() {
        message = "Ты лох";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
