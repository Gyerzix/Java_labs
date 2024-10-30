package lab4.com;

import java.util.Random;

public class SortComparison {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 5000, 10000}; // Размеры массивов для тестирования
        Random rand = new Random();

        for (int size : sizes) {
            int[] array = new int[size];

            // Заполнение массива случайными значениями
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(size * 10);
            }

            // Копии массива для каждого алгоритма
            int[] arrayForInsertion = array.clone();
            int[] arrayForSelection = array.clone();

            // Замер времени для сортировки вставками
            long startTime = System.nanoTime();
            InsertionSort.insertionSort(arrayForInsertion);
            long insertionSortTime = System.nanoTime() - startTime;

            // Замер времени для сортировки выбором
            startTime = System.nanoTime();
            SelectionSort.selectionSort(arrayForSelection);
            long selectionSortTime = System.nanoTime() - startTime;

            System.out.println("Array size: " + size);
            System.out.println("Insertion Sort Time: " + insertionSortTime + " ns");
            System.out.println("Selection Sort Time: " + selectionSortTime + " ns");
            System.out.println();
        }
    }
}

