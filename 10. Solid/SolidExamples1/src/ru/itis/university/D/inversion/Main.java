package ru.itis.university.D.inversion;

public class Main {
    public static void main(String[] args) {
        Home home = new Home(new Boiler());
        home.warm(22);
    }
}
