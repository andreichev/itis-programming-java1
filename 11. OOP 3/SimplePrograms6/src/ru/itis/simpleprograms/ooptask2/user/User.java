package ru.itis.simpleprograms.ooptask2.user;

import ru.itis.simpleprograms.ooptask2.product.Product;

public class User {
    private String name;
    private Product[] basket;

    public User(String name, Product[] basket) {
        this.name = name;
        this.basket = basket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getBasket() {
        return basket;
    }

    public void setBasket(Product[] basket) {
        this.basket = basket;
    }
}
