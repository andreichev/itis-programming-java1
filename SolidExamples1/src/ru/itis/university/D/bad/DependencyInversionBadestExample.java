package ru.itis.university.D.bad;

public class DependencyInversionBadestExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driveToSchool();
    }
}
