package ru.itis.simpleprograms.ooptask1.presons;

import ru.itis.simpleprograms.ooptask1.Art;
import ru.itis.simpleprograms.ooptask1.music.Music;

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

    public String getName() {
        return name;
    }

    public Art[] getArts() {
        return arts;
    }

    public Music[] getAllMusic() {
        int count = 0;
        for(int i = 0; i < arts.length; i++) {
            if(arts[i] instanceof Music) count++;
        }
        Music[] music = new Music[count];
        int j = 0;
        for(int i = 0; i < arts.length; i++) {
            if(arts[i] instanceof Music) {
                music[j] = (Music) arts[i];
                j++;
            }
        }
        return music;
    }

    void die() {
        isAlive = false;
    }
}
