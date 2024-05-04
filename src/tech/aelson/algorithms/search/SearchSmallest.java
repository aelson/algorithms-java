package tech.aelson.algorithms.search;

import tech.aelson.algorithms.model.Product;

public class SearchSmallest {
    public static int findSmallest(Product[] products, int start, int end) {
        int smallest = start;
        for (int atual = start; atual <= end; atual++) {
            if (products[atual].getPrice() < products[smallest].getPrice()) {
                smallest = atual;
            }
        }
        return smallest;
    }
}
