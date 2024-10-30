package lab5.com;

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Проверяем, находится ли целевой элемент в середине
            if (array[mid] == target) {
                return mid; // элемент найден
            }

            // Если целевой элемент больше, игнорируем левую половину
            if (array[mid] < target) {
                left = mid + 1;
            }
            // Если целевой элемент меньше, игнорируем правую половину
            else {
                right = mid - 1;
            }
        }

        return -1; // элемент не найден
    }
}
