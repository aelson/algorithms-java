package tech.aelson.algorithms.search.find_smallest;

import tech.aelson.algorithms.model.Product;

public class FindSmallestTester {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Tesla Model 3", 50000),
                new Product("Toyota Corolla", 20000),
                new Product("Ford Escape", 30000),
                new Product("Honda Civic", 30000),
                new Product("Audi Q5", 45000)
        };

        int smallest = FindSmallest.execute(products, 0, 4);
        System.out.println(smallest);
        System.out.println("The car " + products[smallest].name() + " costs " + products[smallest].price());
    }
}
