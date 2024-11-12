package lab3.com;

import java.util.Random;

public class BubbleSortPerformance {
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
            if (!swapped) break;
        }
    }

    public static void testPerformance(int[] sizes) {
        Random random = new Random();

        for (int size : sizes) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }

            long startTime = System.currentTimeMillis();
            bubbleSort(array);
            long endTime = System.currentTimeMillis();

            System.out.println("Размер массива: " + size + " | Время выполнения: " + (endTime - startTime) + " мс");
        }
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000, 50000};

        testPerformance(sizes);
    }
}


