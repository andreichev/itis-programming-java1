package ru.kfu.itis.example3;

public abstract class Bird {
    String getName() {
        return "Unknown bird";
    }

    void fly() {
        System.out.println(getName() + " NOT FLIES");
    }
}
