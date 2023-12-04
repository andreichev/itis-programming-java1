package ru.itis.university.D.inversion;

public class Home {
    private Heat heat;

    public Home(Heat heat) {
        this.heat = heat;
    }

    void warm(int temperature) {
        heat.warm(temperature);
    }
}
