package ru.itis.animal_shelter.model;

public class Cat extends Pet {
    public Cat(String name, String color, int age, boolean isHungry, int weight) {
        super(name, color, age, isHungry, weight);
    }

    @Override
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
