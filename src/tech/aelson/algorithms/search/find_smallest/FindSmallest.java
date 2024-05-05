package tech.aelson.algorithms.search.find_smallest;

import tech.aelson.algorithms.model.Product;

public class FindSmallest {
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
