package tech.aelson.algorithms.util;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.model.Product;

public class Util {
    public static void swap(Object[] array, int first, int second) {
        System.out.println("<-> Swapping element " + first + " with " + second);

        Object firstProduct = array[first];
        Object secondProduct = array[second];

        System.out.println("<-> Swapping object " + firstProduct + " with " + secondProduct);

        array[first] = secondProduct;
        array[second] = firstProduct;

        System.out.println("------------------------------------");
    }

    public static void printProductsArray(String arrayTitle, Product[] products) {
        System.out.println(arrayTitle);
        for (Product product : products) {
            System.out.println(product.name() + " costs " + product.price());
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

    public static Grade[] getUnsortedGrades(Grade specialGrade) {
        return new Grade[]{
                new Grade("andre", 4),
                new Grade("carlos", 8.5),
                new Grade("ana", 10),
                new Grade("jonas", 3),
                new Grade("juliana", 6.7),
                new Grade("lucia", 9.3),
                new Grade("paulo", 9),
                new Grade("mariana", 5),
                specialGrade,
        };
    }
}
