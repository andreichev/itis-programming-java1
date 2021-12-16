package ru.itis.simpleprograms.ooptask1.presons;

import ru.itis.simpleprograms.ooptask1.Art;

public class Person {
    String name;
    String country;
    boolean isAlive;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
        this.isAlive = true;
    }

    Art[] arts;

    public void setArts(Art[] arts) {
        this.arts = arts;
    }

    public Art[] getArts() {
        return arts;
    }
}
