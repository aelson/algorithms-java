package tech.aelson.algorithms.sort;

import tech.aelson.algorithms.model.Product;

public class SelectionSortTester {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Ford Escape", 30000),
                new Product("Toyota Corolla", 20000),
                new Product("Audi Q5", 45000),
                new Product("Honda Civic", 30000),
                new Product("Tesla Model 3", 50000),
        };
        System.out.println("Original array: ");
        for (Product product : products) {
            System.out.println(product.getName() + " costs " + product.getPrice());
        }

        SelectionSort.execute(products, products.length);

        System.out.println("Sorted array: ");
        for (Product product : products) {
            System.out.println(product.getName() + " costs " + product.getPrice());
        }
    }
}
