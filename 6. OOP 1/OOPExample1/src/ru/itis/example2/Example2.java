package ru.itis.example2;

public class Example2 {
    public static void main(String[] args) {
        Cat.printDescription();
        Bowl.printDescription();

        Cat dendy = new Cat("Dendy", "Black", 1, true, 2);
        Cat perchik = new Cat("Perchik", "Orange", 1, true, 2);
        Cat iriska = new Cat("Iriska", "Grey", 13, true, 4);

        dendy.voice();
        perchik.voice();
        iriska.voice();

        Bowl whiteBowl = new Bowl();
        whiteBowl.fill(30);

        whiteBowl.tryFeed(dendy);
        whiteBowl.tryFeed(perchik);
        whiteBowl.tryFeed(iriska);

        dendy.voice();
        perchik.voice();
        iriska.voice();

        System.out.println(perchik.isFriendlyTo(dendy));
        System.out.println(iriska.getHumanAge());
    }
}
