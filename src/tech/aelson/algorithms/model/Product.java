package tech.aelson.algorithms.model;

public record Product(String name, double price) {
    @Override
    public String toString() {
        return name + " $" + price;
    }
}
