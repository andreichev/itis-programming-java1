package ru.itis.university.D.best;

public class Bus implements ReachType{
    @Override
    public void driveToSchool() {
        System.out.println("Выйди из дома");
        System.out.println("Пойти на остановку");
        System.out.println("Доехать до школы");
    }
}
