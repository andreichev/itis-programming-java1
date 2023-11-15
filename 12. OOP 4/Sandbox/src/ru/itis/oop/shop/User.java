package ru.itis.oop.shop;

import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class User {
    private long id;
    private String name;
    private long age;
    private Instant birthdate;

    public User(long id, String name, Instant birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        Instant now = Instant.now();
        this.age = ChronoUnit.YEARS.between(
                birthdate.atZone(ZoneId.systemDefault()),
                now.atZone(ZoneId.systemDefault()));
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    public Instant getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Instant birthdate) {
        this.birthdate = birthdate;
        Instant now = Instant.now();
        this.age = ChronoUnit.YEARS.between(
                birthdate.atZone(ZoneId.systemDefault()),
                now.atZone(ZoneId.systemDefault()));
    }
}
