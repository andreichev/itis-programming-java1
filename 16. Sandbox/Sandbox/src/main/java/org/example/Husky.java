package org.example;

public class Husky extends Dog {
    float joy;

    public Husky(String name) {
        this(0.0f);
        this.name = name;
    }

    public Husky(float joy) {
        this.joy = joy;
        System.out.println("HUSKY INITIALIZED");
    }

    float eatFurniture() { return 1.f; }
}
