package ru.itis.simpleprograms.ooptask1.music;

import ru.itis.simpleprograms.ooptask1.presons.Person;

public class Jazz extends Music {
    String description;

    public Jazz(String name, int duration, Person author, String url, String description) {
        super(name, duration, author, url);
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
