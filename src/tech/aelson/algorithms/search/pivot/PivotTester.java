package tech.aelson.algorithms.search.pivot;

import tech.aelson.algorithms.model.Grade;
import tech.aelson.algorithms.util.Util;

public class PivotTester {
    public static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7);
        Grade[] unsortedGrades = Util.getUnsortedGrades(guilherme);

        int pivotPosition = Pivot.execute(unsortedGrades, unsortedGrades.length);
        System.out.println("The Pivot is in the position " + pivotPosition);
        for (Grade grade : unsortedGrades) {
            System.out.println(grade.studentName() + " " + grade.result());
        }
    }
}
