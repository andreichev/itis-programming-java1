package ru.itis.oop.shop;

public class Product {
    private String title;
    private String description;
    private int price;
    private int mass;

    public Product(String title, String description, int price, int mass) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.mass = mass;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getMass() {
        return mass;
    }
}
