package ru.itis.example1;

public class Example1 {
    public static void main(String[] args) {
        Player player1 = new Player("Ivan", 10., 20.);
        Player player2 = new Player("Egor", new Vector2(20., 30.));

        player1.sayHello();

        System.out.println(player1.position.distance(player2.position));
    }
}
