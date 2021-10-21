package ru.kfu.itis.example4;

public abstract class Pet {
    String name;
    boolean isHungry;
    int age;
    int weight;
    String color;

    public Pet(String name, String color, int age, boolean isHungry, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    abstract void voice();
}
