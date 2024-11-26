package lab6.com;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000}; // Различные размеры массива
        for (int size : sizes) {
            int[] quickSortArray = generateRandomArray(size);
            int[] mergeSortArray = Arrays.copyOf(quickSortArray, quickSortArray.length); // Копирование массива

            long startTimeQuickSort = System.nanoTime();
            QuickSort.quickSort(quickSortArray, 0, quickSortArray.length - 1);
            long endTimeQuickSort = System.nanoTime();
            long timeQuickSort = endTimeQuickSort - startTimeQuickSort;

            long startTimeMergeSort = System.nanoTime();
            MergeSort.mergeSort(mergeSortArray);
            long endTimeMergeSort = System.nanoTime();
            long timeMergeSort = endTimeMergeSort - startTimeMergeSort;

            System.out.println("Размер массива: " + size);
            System.out.println("Время QuickSort: " + timeQuickSort + " наносекунд");
            System.out.println("Время MergeSort: " + timeMergeSort + " наносекунд");
            System.out.println();
        }
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Числа в пределах от 0 до 999
        }
        return array;
    }
}
