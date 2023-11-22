package ru.itis.programming.sandbox.example1;

public class Bus {
    public void reachSchool(boolean lazyToWalk) {
        if(lazyToWalk) {
            System.out.println("Сесть на 8 тролейбус");
            System.out.println("Выйти на остановке университет");
        } else {
            System.out.println("Сесть на 47 автобус");
            System.out.println("Выйти на остановке тукая");
        }
    }
}
