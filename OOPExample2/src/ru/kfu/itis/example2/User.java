package ru.kfu.itis.example2;

import java.time.LocalDate;

public class User {
    int id;
    String name;
    private LocalDate birthDay;
    private int age;

    public User(int id, String name, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        updateAge();
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
        updateAge();
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    int getAge() {
        return age;
    }

    private void updateAge() {
        age = LocalDate.now().getYear() - birthDay.getYear();
    }
}
