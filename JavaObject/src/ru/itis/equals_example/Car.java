package ru.itis.equals_example;

public class Car {
    String name;
    // Лошади
    int horses;
    // Объем движка
    int engineVolume;
    // Цвет
    String color;
    // Пробег
    int probeg;
    // Двигатель включен или нет
    boolean isEngineOn;
    // Кол-во топлива
    int fuel;

    public Car(String name, int horses, int engineVolume, String color) {
        this.name = name;
        this.horses = horses;
        this.engineVolume = engineVolume;
        this.color = color;
        this.probeg = 0;
        this.isEngineOn = false;
        this.fuel = 0;
    }

    void startEngine() {
        isEngineOn = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (horses != car.horses) return false;
        if (engineVolume != car.engineVolume) return false;
        if (probeg != car.probeg) return false;
        if (isEngineOn != car.isEngineOn) return false;
        if (fuel != car.fuel) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + horses;
        result = 31 * result + engineVolume;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + probeg;
        result = 31 * result + (isEngineOn ? 1 : 0);
        result = 31 * result + fuel;
        return result;
    }
}
