package ru.kfu.itis.example4;

public class Example4 {
    public static void main(String[] args) {
        Cat dendy = new Cat("Dendy", "Black", 0, true, 2);
        Cat perchik = new Cat("Perchik", "Orange", 0, true, 2);
        Cat iriska = new Cat("Iriska", "Grey", 12, true, 4);
        Dog bobik = new Dog("Bobik", "White", 5, true, 5);

        Pet[] pets = {dendy, perchik, iriska, bobik};

        for (Pet pet : pets) {
            pet.voice();
        }

        System.out.println("Pets are eating...");
        Bowl whiteBowl = new Bowl();
        whiteBowl.fill(80);
        System.out.println("Bowl is empty");

        for(Pet p : pets) {
            whiteBowl.tryFeed(p);
        }

        for(Pet p : pets) {
            p.voice();
        }
    }
}
