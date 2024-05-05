package tech.aelson.algorithms.search.pivot;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.util.Util;

public class Pivot {
    public static int execute(Grade[] grades, int end) {
        Grade pivot = grades[end - 1];
        int lowerValuesCount = 0;
        for (int index = 0; index < end - 1; index++) {
            Grade current = grades[index];
            if (current.result() < pivot.result()) {
                if (index != lowerValuesCount) {
                    Util.swap(grades, index, lowerValuesCount);
                }
                lowerValuesCount++;
            }
        }
        if (end - 1 != lowerValuesCount) {
            Util.swap(grades, end - 1, lowerValuesCount);
        }
        return lowerValuesCount;
    }
}
