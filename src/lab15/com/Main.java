package lab15.com;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int size = 1_000_000; // Размер массива
        int[] array = new Random().ints(size, 0, 1_000_000).toArray(); // Генерация случайного массива
        int[] arrayCopy = Arrays.copyOf(array, array.length); // Копия массива для стандартной сортировки

        // Тест параллельной сортировки
        ForkJoinPool pool = new ForkJoinPool();
        ParallelMergeSort task = new ParallelMergeSort(array, 0, array.length - 1);
        long startParallel = System.currentTimeMillis();
        pool.invoke(task);
        long endParallel = System.currentTimeMillis();
        System.out.println("Parallel Merge Sort time: " + (endParallel - startParallel) + " ms");

        // Тест стандартной сортировки
        long startStandard = System.currentTimeMillis();
        Arrays.sort(arrayCopy);
        long endStandard = System.currentTimeMillis();
        System.out.println("Standard Arrays.sort() time: " + (endStandard - startStandard) + " ms");

        // Проверка на совпадение результатов
        boolean isEqual = Arrays.equals(array, arrayCopy);
        System.out.println("Results are equal: " + isEqual);
    }
}

