package lab3.com;

import java.util.Random;
import java.util.Arrays;

public class BubbleSortPerformance {

    // Метод пузырьковой сортировки
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Меняем элементы местами
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если внутренний цикл не совершил ни одной перестановки, то массив отсортирован
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Генерация массива случайных чисел
        int size = 20; // Размер массива
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }

        // Вывод неотсортированного массива
        System.out.println("Оригинальный массив:");
        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}

