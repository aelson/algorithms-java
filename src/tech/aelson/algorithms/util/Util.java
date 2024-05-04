package tech.aelson.algorithms.util;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.model.Product;

public class Util {
    public static void swap(Product[] products, int first, int second) {
        System.out.println("<-> Swapping element " + first + " with " + second);

        Product firstProduct = products[first];
        Product secondProduct = products[second];

        System.out.println("<-> Swapping product " + firstProduct.getName() + " with " + secondProduct.getName());

        products[first] = secondProduct;
        products[second] = firstProduct;

        System.out.println("------------------------------------");
    }

    public static void printProductsArray(String arrayTitle, Product[] products) {
        System.out.println(arrayTitle);
        for (Product product : products) {
            System.out.println(product.getName() + " costs " + product.getPrice());
        }
    }

    public static void printGradesArray(String arrayTitle, Grade[] grades) {
        System.out.println(arrayTitle);
        for (Grade grade : grades) {
            System.out.println(grade.studentName() + " " + grade.result());
        }
    }

    public static Product[] getUnsortedProducts() {
        return new Product[]{
                new Product("Ford Escape", 30000),
                new Product("Toyota Corolla", 20000),
                new Product("Audi Q5", 45000),
                new Product("Honda Civic", 30000),
                new Product("Tesla Model 3", 50000),
        };
    }
}
