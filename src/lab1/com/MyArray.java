package lab1.com;

import java.util.Arrays;

public class MyArray {
    private int[] arr;
    private int size;

    public MyArray(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    public void add(int element) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = element;
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        arr = new int[arr.length];
        size = 0;
    }
}


