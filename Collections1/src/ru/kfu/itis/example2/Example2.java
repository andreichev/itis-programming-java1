package ru.kfu.itis.example2;

// Типы: примитивные, ссылочные простые, ссылочные
public class Example2 {
    static void setXTo20(A link2) {
        link2 = new A();
        link2.x = 20;
    }

    public static void main(String[] args) {
        A link1 = new A();
        link1.x = 10;
        setXTo20(link1);
        System.out.println(link1.x);
    }
}
