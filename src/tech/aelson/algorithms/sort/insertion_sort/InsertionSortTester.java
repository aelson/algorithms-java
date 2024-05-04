package tech.aelson.algorithms.sort.insertion_sort;

import tech.aelson.algorithms.model.Product;
import tech.aelson.algorithms.util.Util;

public class InsertionSortTester {
    public static void main(String[] args) {
        Product[] products = Util.getUnsortedProducts();
        Util.printArray("Original array: ", products);

        InsertionSort.execute(products, products.length);
        Util.printArray("Sorted array: ", products);
    }
}