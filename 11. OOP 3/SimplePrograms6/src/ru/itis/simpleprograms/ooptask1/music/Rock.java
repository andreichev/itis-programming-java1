package ru.itis.simpleprograms.ooptask1.music;

import ru.itis.simpleprograms.ooptask1.presons.Person;

public class Rock extends Music {
    public Rock(String name, int durationMinutes, Person author, String url) {
        super(name, durationMinutes, author, url);
    }

    @Override
    public String getDescription() {
        return null;
    }
}
