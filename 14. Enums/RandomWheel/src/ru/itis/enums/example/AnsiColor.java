package ru.itis.enums.example;

public enum AnsiColor {
    RESET("\u001B[0m"),
    RED( "\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW( "\u001B[33m"),
    BLUE("\u001B[34m")
    ;

    public final String code;

    AnsiColor(String code) {
        this.code = code;
    }

    static AnsiColor[] getAll() {
        return new AnsiColor[] { BLUE, GREEN, YELLOW, RED };
    }
}
