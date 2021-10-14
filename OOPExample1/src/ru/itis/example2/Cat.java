package ru.itis.example2;

public class Cat {
    String name;
    String color;
    int age;
    boolean isHungry;
    int weight;

    public Cat(String name, String color, int age, boolean isHungry, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    void voice() {
        System.out.print(name + ": Meow");
        if(isHungry) {
            System.out.print(", I am hungry");
        } else {
            System.out.print(", I am full");
        }
        System.out.println();
    }

    boolean isFriendlyTo(Cat other) {
        return Math.abs(age - other.age) <= 5;
    }

    int getHumanAge() {
        return age * 7;
    }

    static void printDescription() {
        System.out.println("Cat is a domestic cute creature");
    }
}
