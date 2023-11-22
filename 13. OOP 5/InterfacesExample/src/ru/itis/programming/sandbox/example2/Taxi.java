package ru.itis.programming.sandbox.example2;

public class Taxi implements Transport {
    @Override
    public void reachSchool() {
        System.out.println("Отписаться кто еще проспал");
        System.out.println("Вызвать такси");
        System.out.println("Доехать до универа");
    }
}
