package ru.itis.simpleprograms.ooptask1;

import ru.itis.simpleprograms.ooptask1.music.Jazz;
import ru.itis.simpleprograms.ooptask1.presons.Person;

public class OOPTask {
    public static void main(String[] args) {
        Person joseph = new Person("Joseph Cosmo", "Israel");
        Jazz autumnLeaves = new Jazz("Leaves", 5, joseph, "", "Cosmo music");
        joseph.setArts(new Art[]{autumnLeaves});

        System.out.println(autumnLeaves.getDescription());
    }
}
