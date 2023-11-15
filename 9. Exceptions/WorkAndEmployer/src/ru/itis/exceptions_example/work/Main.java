package ru.itis.exceptions_example.work;

import ru.itis.exceptions_example.work.impl.Ilya;
import ru.itis.exceptions_example.work.impl.SberbankWork;
import ru.itis.exceptions_example.work.model.Money;

public class Main {
    public static void main(String[] args) {
        Work work = new SberbankWork();
        Person person = new Ilya();
        Money money = work.doWork(person);
        System.out.println("Заработано " + money.getAmount() + " " + money.getCurrency());
    }
}