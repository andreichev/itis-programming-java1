package ru.itis.simpleprograms.ooptask1.music;

import ru.itis.simpleprograms.ooptask1.Art;
import ru.itis.simpleprograms.ooptask1.presons.Person;

public abstract class Music implements Art {
    String name;
    int durationMinutes;
    Person author;
    String url;

    public Music(String name, int durationMinutes, Person author, String url) {
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.author = author;
        this.url = url;
    }

    public Music(String name, int durationMinutes, Person author) {
        this.name = name;
        this.durationMinutes = durationMinutes;
        this.author = author;
        this.url = null;
    }

    public void play() {
        System.out.println("Music " + name + " is playing");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Person getAuthor() {
        return author;
    }

    public abstract String getDescription();
}
