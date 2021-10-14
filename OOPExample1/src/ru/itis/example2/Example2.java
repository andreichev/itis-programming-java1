package ru.itis.example2;

public class Example2 {
    public static void main(String[] args) {
        Cat.printDescription();
        Bowl.printDescription();

        Cat dendy = new Cat("Dendy", "Black", 0, true, 2);
        Cat perchik = new Cat("Perchik", "Orange", 0, true, 2);
        Cat iriska = new Cat("Iriska", "Grey", 12, true, 4);

        dendy.voice();
        perchik.voice();
        iriska.voice();

        Bowl whiteBowl = new Bowl();
        whiteBowl.fill(80);

        whiteBowl.tryFeed(dendy);
        whiteBowl.tryFeed(perchik);
        whiteBowl.tryFeed(iriska);

        dendy.voice();
        perchik.voice();
        iriska.voice();

        System.out.println(dendy.isFriendlyTo(perchik));
        System.out.println(dendy.getHumanAge());
    }
}
