package tech.aelson.algorithms.search.pivot;

import tech.aelson.algorithms.model.Grade;

public class PivotTester {
    public static void main(String[] args) {
        Grade guilherme = new Grade("guilherme", 7);
        Grade[] unsortedGrades = {
                new Grade("andre", 4),
                new Grade("carlos", 8.5),
                new Grade("ana", 10),
                new Grade("jonas", 3),
                new Grade("juliana", 6.7),
                new Grade("lucia", 9.3),
                new Grade("paulo", 9),
                new Grade("mariana", 5),
                guilherme,
        };

        int pivotPosition = Pivot.execute(unsortedGrades, 0, unsortedGrades.length);
        System.out.println("The Pivot is in the position " + pivotPosition);
        for (Grade grade : unsortedGrades) {
            System.out.println(grade.studentName() + " " + grade.result());
        }
    }
}
