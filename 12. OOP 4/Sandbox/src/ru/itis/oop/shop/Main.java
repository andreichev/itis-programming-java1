package ru.itis.oop.shop;

import ru.itis.oop.shop.User;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        User user = new User(0L, "Anton", Instant.parse("2007-12-03T00:00:00.00Z"));

        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getBirthdate());

        user.setBirthdate(Instant.parse("2000-12-03T00:00:00.00Z"));

        System.out.println("--------------");

        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getBirthdate());


        Product product = new Laptop(
                "Acer aspire", "Good laptop",
                100, 2, 15, "Acer", "Intel Core i5"
        );

        System.out.println(product.getTitle());
    }
}