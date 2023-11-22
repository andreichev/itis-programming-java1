package ru.itis.programming.sandbox.example2;

public class Bus implements Transport {
    @Override
    public void reachSchool() {
        if(Math.random() > 0.5) {
            System.out.println("Сесть на 8 тролейбус");
            System.out.println("Выйти на остановке университет");
        } else {
            System.out.println("Сесть на 47 автобус");
            System.out.println("Выйти на остановке тукая");
        }
    }
}
