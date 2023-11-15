package ru.itis.exceptions_example.work.impl;

import ru.itis.exceptions_example.work.Person;
import ru.itis.exceptions_example.work.Product;
import ru.itis.exceptions_example.work.model.PersonException;

public class Ilya implements Person {
    @Override
    public Product doWork() throws PersonException {
        System.out.println("Сейчас буду работать");
        if(Math.random() > 0.9) {
            throw new PersonException("Ой забухал");
        }
        System.out.println("Программа готова");
        return new Program();
    }
}
