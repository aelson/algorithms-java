package tech.aelson.algorithms.model;

public class Product {
    private final String name;
    private final double price;

    public Product(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
