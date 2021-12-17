package ru.itis.simpleprograms.ooptask2.offer;

import ru.itis.simpleprograms.ooptask2.product.Product;
import ru.itis.simpleprograms.ooptask2.user.User;

import java.util.Arrays;

public class Offer {
    private User user;
    private Product[] products;
    private OfferState state;

    public Offer(User user, Product[] products, OfferState state) {
        this.user = user;
        this.products = products;
        this.state = state;
    }

    int getAmount() {
        int price = 0;
        for(int i = 0; i < products.length; i++) {
            price += products[i].getPrice();
        }
        return price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public OfferState getState() {
        return state;
    }

    public void setState(OfferState state) {
        this.state = state;
    }

    public void printDescription() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "OFFER, User: " + user.getName() + ", amount: " + getAmount() + " " + " state: " + getState() + " products: " + Arrays.toString(getProducts());
    }
}
