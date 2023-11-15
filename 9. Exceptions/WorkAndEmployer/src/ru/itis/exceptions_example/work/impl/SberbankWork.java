package ru.itis.exceptions_example.work.impl;

import ru.itis.exceptions_example.work.Person;
import ru.itis.exceptions_example.work.Product;
import ru.itis.exceptions_example.work.Work;
import ru.itis.exceptions_example.work.model.Money;
import ru.itis.exceptions_example.work.model.PersonException;

public class SberbankWork implements Work {
    @Override
    public Money doWork(Person person) {
        Product product;
        try {
            product = person.doWork();
        } catch (PersonException e) {
            System.out.println(e.getMessage());
            System.out.println("Работа не выполнена");
            return new Money(0, "RUB");
        }
        System.out.println(product);
        System.out.println("Работа выполнена");
        return new Money(300_000, "RUB");
    }
}
