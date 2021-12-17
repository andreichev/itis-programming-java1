package ru.itis.simpleprograms.ooptask1.paintings;

import ru.itis.simpleprograms.ooptask1.Art;
import ru.itis.simpleprograms.ooptask1.presons.Person;

public class Picture implements Art {
    String name;
    Person author;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Person getAuthor() {
        return author;
    }
}
