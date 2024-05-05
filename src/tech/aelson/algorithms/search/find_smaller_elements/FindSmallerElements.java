package tech.aelson.algorithms.search.find_smaller_elements;

import tech.aelson.algorithms.model.Grade;

public class FindSmallerElements {
    public static int execute(Grade reference, Grade[] unsortedGradle) {
        int lowerValuesCount = 0;
        for (Grade grade : unsortedGradle) {
            if (grade.result() < reference.result()) {
                lowerValuesCount++;
            }
        }
        return lowerValuesCount;
    }
}
