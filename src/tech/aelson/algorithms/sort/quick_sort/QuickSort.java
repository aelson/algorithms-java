package tech.aelson.algorithms.sort.quick_sort;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.search.pivot.Pivot;

public class QuickSort {
    public static void execute(Grade[] grades, int start, int end) {
        System.out.println("Executing for " + start + " - " + end);
        int numberOfElements = end - start;
        if (numberOfElements > 1) {
            int pivotIndex = Pivot.execute(grades, end);
            execute(grades, start, pivotIndex);
            execute(grades, pivotIndex + 1, end);
        }
    }
}
