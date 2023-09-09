package ru.itis.javalessons.task2;

public class Task2 {
    public static void main(String[] args) {
        XString str1 = new XString("HELLO");
        XString space = new XString(" ");
        XString str2 = new XString("MICHAIL");

        System.out.println(str1.adding(space).adding(str2));
    }
}
