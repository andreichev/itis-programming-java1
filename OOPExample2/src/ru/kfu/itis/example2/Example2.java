package ru.kfu.itis.example2;

import java.time.LocalDate;

public class Example2 {
    public static void main(String[] args) {
        User ivan = new User(1, "Ivan Ivanov", LocalDate.of(2005, 3, 20));
        ivan.setBirthDay(LocalDate.of(2004, 3, 20));
        System.out.println(ivan.getAge());
    }
}
