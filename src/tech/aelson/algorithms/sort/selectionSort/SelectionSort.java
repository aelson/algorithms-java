package tech.aelson.algorithms.sort.selectionSort;

import tech.aelson.algorithms.model.Product;
import tech.aelson.algorithms.search.SearchSmallest;
import tech.aelson.algorithms.util.Util;

public class SelectionSort {
    public static void execute(Product[] products, int numberOfElements) {
        for (int current = 0; current < numberOfElements - 1; current++) {
            System.out.println("I am in the element " + current);
            int smallest = SearchSmallest.execute(products, current, products.length - 1);
            Util.swap(products, current, smallest);
        }
    }
}
