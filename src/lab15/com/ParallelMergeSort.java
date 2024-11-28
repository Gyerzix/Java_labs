package lab15.com;

import java.util.concurrent.RecursiveAction;

public class ParallelMergeSort extends RecursiveAction {
    private final int[] array;
    private final int left;
    private final int right;
    private static final int THRESHOLD = 500; // Порог для выполнения в одном потоке
    public ParallelMergeSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
    }
    @Override
    protected void compute() {
        if (right - left <= THRESHOLD) {
            // Выполняем сортировку в одном потоке, если размер небольшой
            insertionSort(array, left, right);
        } else {
            // Разделяем задачу на две подзадачи
            int mid = (left + right) / 2;
            ParallelMergeSort leftTask = new ParallelMergeSort(array, left, mid);
            ParallelMergeSort rightTask = new ParallelMergeSort(array, mid + 1, right);
            invokeAll(leftTask, rightTask); // Параллельное выполнение задач
            merge(array, left, mid, right); // Слияние отсортированных частей
        }
    }
    private void insertionSort(int[] array, int left, int right) {
        for (int i = left; i <= right; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= left && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }
}
