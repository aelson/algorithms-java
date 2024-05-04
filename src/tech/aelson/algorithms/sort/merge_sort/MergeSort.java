package tech.aelson.algorithms.sort.merge_sort;

import tech.aelson.algorithms.model.Grade;

public class MergeSort {
    public static Grade[] mergeTwoArrays(Grade[] firstArray, Grade[] secondArray) {
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

    public static Grade[] sortOneArray(Grade[] array, int start, int middle, int end) {
        int total = array.length;
        Grade[] sorted = new Grade[total - start];
        int sortedIndex = 0;
        int firstPartIndex = start;
        int secondPartIndex = middle;
        while (firstPartIndex < middle && secondPartIndex < end) {
            System.out.println("Comparing " + array[firstPartIndex].studentName() + " (" + array[firstPartIndex].result() + ") with " + array[secondPartIndex].studentName() + " (" + array[secondPartIndex].result() + ")");

            if (array[firstPartIndex].result() < array[secondPartIndex].result()) {
                System.out.println("-> Inserting " + array[firstPartIndex].studentName() + " (" + array[firstPartIndex].result() + ") on the position " + sortedIndex);
                sorted[sortedIndex] = array[firstPartIndex];
                firstPartIndex++;
            } else {
                System.out.println("-> Inserting " + array[secondPartIndex].studentName() + " (" + array[secondPartIndex].result() + ") on the position " + sortedIndex);
                sorted[sortedIndex] = array[secondPartIndex];
                secondPartIndex++;
            }
            System.out.println("------------------------------------");
            sortedIndex++;
        }
        while (firstPartIndex < middle) {
            System.out.println("-> Inserting " + array[firstPartIndex].studentName() + " (" + array[firstPartIndex].result() + ") on the position " + sortedIndex + " because it is left over from the first part of the array");
            sorted[sortedIndex] = array[firstPartIndex];
            firstPartIndex++;
            sortedIndex++;
        }
        while (secondPartIndex < end) {
            System.out.println("-> Inserting " + array[secondPartIndex].studentName() + " (" + array[secondPartIndex].result() + ") on the position " + sortedIndex + " because it is left over from the second part of the array");
            sorted[sortedIndex] = array[secondPartIndex];
            secondPartIndex++;
            sortedIndex++;
        }
        if (start > 0) {
            System.out.println("Rebuilding the original array keeping the initial object(s) not ordered (because the start is greater then 0)");
            for (int indexOfMerged = 0; indexOfMerged < sortedIndex; indexOfMerged++) {
                System.out.println("-> Inserting " + sorted[indexOfMerged].studentName() + " (" + sorted[indexOfMerged].result() + ") on the position " + indexOfMerged);
                array[start + indexOfMerged] = sorted[indexOfMerged];
            }
        }
        return array;
    }
}
