package ru.itis.animal_shelter.model;

public class Dog extends Pet {
    public Dog(String name, String color, int age, boolean isHungry, int weight) {
        super(name, color, age, isHungry, weight);
    }

    @Override
    void voice() {
        System.out.print(name + ": Bark!");
        if(isHungry) {
            System.out.print(", I am hungry");
        } else {
            System.out.print(", I am full");
        }
        System.out.println();
    }
}
