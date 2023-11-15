package ru.itis.oop.shop;

public class Laptop extends Product {
    private int displaySize;
    private String brand;
    private String cpu;

    public Laptop(
            String title, String description,
            int price, int mass, int displaySize,
            String brand, String cpu
    ) {
        super(title, description, price, mass);
        this.displaySize = displaySize;
        this.brand = brand;
        this.cpu = cpu;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public String getBrand() {
        return brand;
    }

    public String getCpu() {
        return cpu;
    }
}
