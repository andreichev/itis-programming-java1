package ru.itis.programming.sandbox.example1;

public class Example1 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Metro metro = new Metro();
        Taxi taxi = new Taxi();

        System.out.println("Проснуться");
        System.out.println("Одеться");
        boolean overslept = true;
        boolean overcrowded = true;
        boolean lazyToWalk = true;
        if(overslept) {
            taxi.driveToSchool();
        } else {
            System.out.println("Идти на остановку");
            if(overcrowded) {
                metro.reachSchool();
            } else {
                bus.reachSchool(lazyToWalk);
            }
        }
        System.out.println("Дойти до универа");
    }
}
