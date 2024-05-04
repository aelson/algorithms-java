package tech.aelson.algorithms.search;

import tech.aelson.algorithms.model.Product;

public class SearchSmallest {
    public static int execute(Product[] products, int start, int end) {
        int smallest = start;
        for (int atual = start; atual <= end; atual++) {
            if (products[atual].price() < products[smallest].price()) {
                smallest = atual;
            }
        }
        return smallest;
    }
}
