package ru.itis.simpleprograms.ooptask2;

import ru.itis.simpleprograms.ooptask2.offer.Offer;
import ru.itis.simpleprograms.ooptask2.offer.OfferState;
import ru.itis.simpleprograms.ooptask2.product.Product;
import ru.itis.simpleprograms.ooptask2.product.ProductColor;
import ru.itis.simpleprograms.ooptask2.user.User;

public class OOPTask2 {
    public static void main(String[] args) {
        Product product = new Product("Kovta", 500, ProductColor.GREEN);
        User user = new User("Ivan", new Product[] {product});
        Offer offer = new Offer(user, user.getBasket(), OfferState.PROCESSING);

        System.out.println(offer);
    }
}
