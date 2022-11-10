package ru.itis.oopexample.example3;

// static для функции класса - доступ только через класс (не через ссылку на объект)
public class Example3 {
    public static void main(String[] args) {
        Tree birch = new Tree("Birch", 5);
        System.out.println(birch);
    }
}
