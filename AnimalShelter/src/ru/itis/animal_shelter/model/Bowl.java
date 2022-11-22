package ru.itis.animal_shelter.model;

public class Bowl {
    int foodCount;

    Bowl() {
        foodCount = 0;
    }

    void fill(int amount) {
        foodCount += amount;
    }

    boolean tryFeed(Pet pet) {
        if(pet.isHungry == false) {
            return false;
        }
        int needToFeed = 10 * pet.weight;
        if(foodCount < needToFeed) {
            return false;
        }
        foodCount -= needToFeed;
        pet.isHungry = false;
        return true;
    }

    static void printDescription() {
        System.out.println("Bowl for cats");
    }
}
