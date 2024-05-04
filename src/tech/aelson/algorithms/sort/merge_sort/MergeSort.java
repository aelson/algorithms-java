package tech.aelson.algorithms.sort.merge_sort;

import tech.aelson.algorithms.model.Grade;

public class MergeSort {
    public static Grade[] execute(Grade[] firstArray, Grade[] secondArray) {
        int total = firstArray.length + secondArray.length;
        Grade[] merged = new Grade[total];
        int currentOfFirstArray = 0;
        int currentOfSecondArray = 0;
        int currentOfMerged = 0;
        while (currentOfFirstArray < firstArray.length && currentOfSecondArray < secondArray.length) {
            Grade grade1 = firstArray[currentOfFirstArray];
            Grade grade2 = secondArray[currentOfSecondArray];

            System.out.println("Comparing " + grade1.studentName() + " (" + grade1.result() + ") with " + grade2.studentName() + " (" + grade2.result() + ")");

            if (grade1.result() < grade2.result()) {
                System.out.println("-> Inserting " + grade1.studentName() + " (" + grade1.result() + ") on the position " + currentOfMerged);
                merged[currentOfMerged] = grade1;
                currentOfFirstArray++;
            } else {
                System.out.println("-> Inserting " + grade2.studentName() + " (" + grade2.result() + ") on the position " + currentOfMerged);
                merged[currentOfMerged] = grade2;
                currentOfSecondArray++;
            }
            System.out.println("------------------------------------");
            currentOfMerged++;
        }
        while (currentOfFirstArray < firstArray.length) {
            System.out.println("-> Inserting " + firstArray[currentOfFirstArray].studentName() + " (" + firstArray[currentOfFirstArray].result() + ") on the position " + currentOfMerged + " because it is left over from the first array");
            merged[currentOfMerged] = firstArray[currentOfFirstArray];
            currentOfFirstArray++;
            currentOfMerged++;
        }
        while (currentOfSecondArray < secondArray.length) {
            System.out.println("-> Inserting " + secondArray[currentOfSecondArray].studentName() + " (" + secondArray[currentOfSecondArray].result() + ") on the position " + currentOfMerged + " because it is left over from the second array");
            merged[currentOfMerged] = secondArray[currentOfSecondArray];
            currentOfSecondArray++;
            currentOfMerged++;
        }
        return merged;
    }
}
