package tech.aelson.algorithms.sort.quick_sort;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.util.Util;

public class QuickSortTester {
    public static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7);
        Grade[] unsortedGrades = Util.getUnsortedGrades(guilherme);

        QuickSort.execute(unsortedGrades, 0, unsortedGrades.length);
        Util.printGradesArray("Sorted array: ", unsortedGrades);
    }
}
