package ru.itis.university.D.best;

public class DependencyInversionBestExample {
    public static void main(String[] args) {
        ReachType reachType = new Taxi();
        reachType.driveToSchool();
    }
}
