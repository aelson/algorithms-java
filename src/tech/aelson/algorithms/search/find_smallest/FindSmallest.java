package tech.aelson.algorithms.search.find_smallest;

import tech.aelson.algorithms.model.Product;

public class FindSmallest {
    public static int execute(Product[] products, int start, int end) {
        int smallest = start;
        for (int index = start; index <= end; index++) {
            if (products[index].price() < products[smallest].price()) {
                smallest = index;
            }
        }
        return smallest;
    }
}
