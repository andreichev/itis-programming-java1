package ru.itis.university.D.badest;

// D - Dependency Inversion
// Верхние уровни абстракции не должны зависеть от нижних
public class DependencyInversionBadExample {
    public static void main(String[] args) {
        System.out.println("Выйди из дома");
        System.out.println("Дойти до остановки");
        System.out.println("Сесть в автобус");
        System.out.println("Доехать до школы");
    }
}
