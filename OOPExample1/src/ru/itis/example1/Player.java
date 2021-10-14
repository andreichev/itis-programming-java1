package ru.itis.example1;

public class Player {
    String name;
    Vector2 position;
    double health;

    public Player(String name, double x, double y) {
        this.name = name;
        position = new Vector2(x, y);
        health = 100.;
    }

    public Player(String name, Vector2 position) {
        this.name = name;
        this.position = position;
        health = 100.;
    }

    void sayHello() {
        System.out.println("Hello, I am " + name);
    }
}
