package com.itis.oopexample.example2;

// Тернальный оператор
public class Example2 {
    public static void main(String[] args) {
        int x = 4;

        if (x == 4) {
            System.out.println("Хорошо");
        } else {
            System.out.println("Отлично");
        }

        // Укороченная запись двух вариантного if
        System.out.println(x == 4 ? "Хорошо" : "Отлично");
    }
}
