package ru.itis.university.D.bad;

public class DependencyInversionBadestExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.bookTaxi();
        taxi.waitForTaxi();
        taxi.driveToSchool();
    }
}
