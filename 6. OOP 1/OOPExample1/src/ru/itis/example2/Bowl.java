package ru.itis.example2;

public class Bowl {
    int foodCount;

    Bowl() {
        foodCount = 0;
    }

    void fill(int amount) {
        foodCount += amount;
    }

    boolean tryFeed(Cat cat) {
        if(cat.isHungry == false) {
            return false;
        }
        int needToFeed = 10 * cat.weight;
        if(foodCount < needToFeed) {
            return false;
        }
        foodCount -= needToFeed;
        cat.isHungry = false;
        return true;
    }

    static void printDescription() {
        System.out.println("Bowl for cats");
    }
}
