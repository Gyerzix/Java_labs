package lab4.com;

import java.util.Random;

public class SortComparison {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 50000};
        Random rand = new Random();
        for (int size : sizes) {
            int[] array = new int[size];

            // Заполняем массив случайными числами
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(size * 10);
            }

            int[] arrayForInsertion = array.clone();
            int[] arrayForSelection = array.clone();

            long startTime = System.nanoTime();
            InsertionSort.insertionSort(arrayForInsertion);
            long insertionSortTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            SelectionSort.selectionSort(arrayForSelection);
            long selectionSortTime = System.nanoTime() - startTime;

            double insertionSortTimeMs = insertionSortTime / 1_000_000.0;
            double selectionSortTimeMs = selectionSortTime / 1_000_000.0;

            System.out.println("Размер массива: " + size + " элементов");
            System.out.printf("Время выполнения сортировки вставками: %.3f мс%n", insertionSortTimeMs);
            System.out.printf("Время выполнения сортировки выбором: %.3f мс%n", selectionSortTimeMs);
            System.out.println();
        }
    }
}

