package ru.itis.oop.shop;

public class Smartphone extends Product {
    private String model;
    private int camerasCount;

    public Smartphone(String title, String description, int price, int mass, String model, int camerasCount) {
        super(title, description, price, mass);
        this.model = model;
        this.camerasCount = camerasCount;
    }
}
