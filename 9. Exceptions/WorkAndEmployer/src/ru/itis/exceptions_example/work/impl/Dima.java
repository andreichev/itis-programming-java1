package ru.itis.exceptions_example.work.impl;

import ru.itis.exceptions_example.work.Person;
import ru.itis.exceptions_example.work.Product;

public class Dima implements Person {
    @Override
    public Product doWork() {
        System.out.println("Я люблю работать");
        System.out.println("Я рад что у меня есть работа");
        System.out.println("Вот программа дайте деньги");
        return new Program();
    }
}
