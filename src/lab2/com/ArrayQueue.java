package lab2.com;

public class ArrayQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public ArrayQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        count++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        count--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }
}

