package ru.itis.simpleprograms.ooptask2.product;

public class Product {
    private String name;
    private int price;
    private ProductState productState;
    private ProductColor productColor;

    public Product(String name, int price, ProductColor productColor) {
        this(name, price, ProductState.AVAILABLE, productColor);
    }

    public Product(String name, int price, ProductState productState, ProductColor productColor) {
        this.name = name;
        this.price = price;
        this.productState = productState;
        this.productColor = productColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductState getProductState() {
        return productState;
    }

    public void setProductState(ProductState productState) {
        this.productState = productState;
    }

    public ProductColor getProductColor() {
        return productColor;
    }

    public void setProductColor(ProductColor productColor) {
        this.productColor = productColor;
    }

    @Override
    public String toString() {
        return "Product" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productState=" + productState +
                ", productColor=" + productColor;
    }
}
