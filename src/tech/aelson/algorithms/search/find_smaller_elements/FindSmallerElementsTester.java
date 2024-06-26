package tech.aelson.algorithms.search.find_smaller_elements;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.util.Util;

public class FindSmallerElementsTester {

    public static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7);
        Grade[] unsortedGrades = Util.getUnsortedGrades(guilherme);

        int lowerValuesCount = FindSmallerElements.execute(guilherme, unsortedGrades);
        System.out.println("Lower values count: " + lowerValuesCount);
    }
}
