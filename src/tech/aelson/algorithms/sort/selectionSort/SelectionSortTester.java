package tech.aelson.algorithms.sort.selectionSort;

import tech.aelson.algorithms.model.Product;
import tech.aelson.algorithms.util.Util;

public class SelectionSortTester {
    public static void main(String[] args) {
        Product[] products = Util.getUnsortedProducts();
        Util.printArray("Original array: ", products);

        SelectionSort.execute(products, products.length);
        Util.printArray("Sorted array: ", products);
    }
}
