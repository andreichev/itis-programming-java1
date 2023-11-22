package ru.itis.programming.sandbox.example2;

public class Example2 {
    public static void main(String[] args) {
        Transport transport;
        System.out.println("Проснуться");
        System.out.println("Одеться");
        boolean overslept = true;
        boolean overcrowded = true;
        boolean lazyToWalk = true;
        boolean spring = true;
        if (spring && Math.random() > 0.5) {
            transport = new Bike();
        } else {
            if (overslept) {
                transport = new Taxi();
            } else {
                System.out.println("Идти на остановку");
                if (overcrowded) {
                    transport = new Metro();
                } else {
                    transport = new Bus();
                }
            }
        }
        transport.reachSchool();
        System.out.println("Дойти до универа");
    }
}
