package ru.itis.exceptions_example.work.impl;

import ru.itis.exceptions_example.work.Person;
import ru.itis.exceptions_example.work.Product;

public class Misha implements Person {
    @Override
    public Product doWork() {
        System.out.println("Лень работать");
        System.out.println("Пойду погуляю");
        System.out.println("Ой придется");
        System.out.println("Все сделал");
        return new Program();
    }
}
