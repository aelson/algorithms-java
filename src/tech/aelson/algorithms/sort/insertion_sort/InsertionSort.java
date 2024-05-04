package tech.aelson.algorithms.sort.insertion_sort;

import tech.aelson.algorithms.model.Product;
import tech.aelson.algorithms.util.Util;

public class InsertionSort {
    public static void execute(Product[] products, int numberOfElements) {
        for (int current = 1; current < numberOfElements; current++) {
            System.out.println("I am in the element " + current);
            int elementBeingAnalysed = current;
            while (elementBeingAnalysed > 0 && products[elementBeingAnalysed].getPrice() < products[elementBeingAnalysed - 1].getPrice()) {
                Util.swap(products, elementBeingAnalysed, elementBeingAnalysed - 1);
                elementBeingAnalysed--;
            }
        }
    }
}
