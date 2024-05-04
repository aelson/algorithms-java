package tech.aelson.algorithms.sort;

import tech.aelson.algorithms.model.Product;
import tech.aelson.algorithms.search.SearchSmallest;

public class SelectionSort {
    public static void execute(Product[] products, int numberOfElements) {
        for (int current = 0; current < numberOfElements - 1; current++) {
            System.out.println("I am in the element " + current);

            int smallest = SearchSmallest.execute(products, current, products.length - 1);

            System.out.println("<-> Swapping element " + current + " with element " + smallest);

            Product currentProduct = products[current];
            Product smallestProduct = products[smallest];

            System.out.println("<-> Swapping product " + currentProduct.getName() + " with product " + smallestProduct.getName());

            products[current] = smallestProduct;
            products[smallest] = currentProduct;
            System.out.println("------------------------------------");
        }
    }
}
