package tech.aelson.algorithms.sort.merge_sort;

import tech.aelson.algorithms.model.Grade;

public class MergeSort {

    public static void mergeSort(Grade[] grades, int start, int end) {
        int numberOfElements = end - start;
        if (numberOfElements > 1) {
            int middle = (start + end) / 2;
            mergeSort(grades, start, middle);
            mergeSort(grades, middle, end);
            sortOneArrayWithTwoOrderedHalfs(grades, start, middle, end);
        }
    }

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
        currentOfMerged = addRemainingElementsToEndOfArray(firstArray, firstArray.length, currentOfFirstArray, merged, currentOfMerged);
        addRemainingElementsToEndOfArray(secondArray, secondArray.length, currentOfSecondArray, merged, currentOfMerged);
        return merged;
    }

    public static void sortOneArrayWithTwoOrderedHalfs(Grade[] array, int start, int middle, int end) {
        Grade[] sorted = new Grade[end - start];
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

        sortedIndex = addRemainingElementsToEndOfArray(array, middle, firstPartIndex, sorted, sortedIndex);
        addRemainingElementsToEndOfArray(array, end, secondPartIndex, sorted, sortedIndex);
        rebuildArray(array, start, sortedIndex, sorted);
    }

    private static int addRemainingElementsToEndOfArray(Grade[] array, int arrayEnd, int arrayIndex, Grade[] merged, int mergedArrayIndex) {
        while (arrayIndex < arrayEnd) {
            System.out.println("-> Inserting " + array[arrayIndex].studentName() + " (" + array[arrayIndex].result() + ") on the position " + mergedArrayIndex + " because it is left over from the first array");
            merged[mergedArrayIndex] = array[arrayIndex];
            arrayIndex++;
            mergedArrayIndex++;
        }
        return mergedArrayIndex;
    }

    private static void rebuildArray(Grade[] array, int start, int sortedIndex, Grade[] sorted) {
        System.out.println("Rebuilding the original array");
        for (int indexOfMerged = 0; indexOfMerged < sortedIndex; indexOfMerged++) {
            System.out.println("-> Inserting " + sorted[indexOfMerged].studentName() + " (" + sorted[indexOfMerged].result() + ") on the position " + indexOfMerged);
            array[start + indexOfMerged] = sorted[indexOfMerged];
        }
    }
}
