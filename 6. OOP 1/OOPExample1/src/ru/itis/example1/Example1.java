package ru.itis.example1;

public class Example1 {
    public static void main(String[] args) {
        Player player1 = new Player("Ivan", 3, 2);
        Player player2 = new Player("Egor", -1, 2);

        player1.sayHello();

        System.out.println(player1.position.distance(player2.position));
    }
}
