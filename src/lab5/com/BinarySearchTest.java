package lab5.com;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] sizes = {10, 20, 30}; // Размеры массивов для тестирования
        Random rand = new Random();

        for (int size : sizes) {
            // Создаем и сортируем массив случайных чисел
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = rand.nextInt(size * 10); // Заполняем случайными числами
            }
            Arrays.sort(array); // Сортируем массив для бинарного поиска

            // Выводим отсортированный массив
            System.out.println("Sorted Array (size " + size + "): " + Arrays.toString(array));

            // Пример поиска существующего элемента
            int target = array[rand.nextInt(size)]; // выбираем случайный элемент из массива
            int result = BinarySearch.binarySearch(array, target);
            System.out.println("Searching for existing element " + target + ": Found at index " + result);

            // Пример поиска несуществующего элемента
            target = size * 10 + 1; // выбираем элемент вне диапазона массива
            result = BinarySearch.binarySearch(array, target);
            System.out.println("Searching for non-existing element " + target + ": Result " + result);
            System.out.println();
        }
    }
}
