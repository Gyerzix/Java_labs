package lab2.com;

public class Main {
    public static void main(String[] args) {
        // Тестирование ArrayQueue
        System.out.println("Тестирование ArrayQueue:");
        ArrayQueue arrayQueue = new ArrayQueue(5);

        // Добавляем элементы в очередь
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        System.out.println("ArrayQueue после добавления элементов (enqueue):");
        arrayQueue.printQueue();

        // Удаляем элемент из очереди
        System.out.println("Вызов метода dequeue() — удаление первого элемента");
        arrayQueue.dequeue();
        System.out.println("ArrayQueue после удаления одного элемента:");
        arrayQueue.printQueue();

        // Просмотр первого элемента
        System.out.println("Вызов метода peek() — просмотр первого элемента");
        System.out.println("Первый элемент в очереди: " + arrayQueue.peek());

        System.out.println("-----------------------------------");

        // Тестирование ArrayStack
        System.out.println("Тестирование ArrayStack:");
        ArrayStack arrayStack = new ArrayStack(5);

        // Добавляем элементы в стек
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        System.out.println("ArrayStack после добавления элементов (push):");
        arrayStack.printStack();

        // Удаляем элемент из стека
        System.out.println("Вызов метода pop() — удаление верхнего элемента");
        arrayStack.pop();
        System.out.println("ArrayStack после удаления одного элемента:");
        arrayStack.printStack();

        // Просмотр верхнего элемента
        System.out.println("Вызов метода peek() — просмотр верхнего элемента");
        System.out.println("Верхний элемент в стеке: " + arrayStack.peek());

        System.out.println("-----------------------------------");

        // Тестирование LinkedListQueue
        System.out.println("Тестирование LinkedListQueue:");
        LinkedListQueue linkedListQueue = new LinkedListQueue();

        // Добавляем элементы в очередь
        linkedListQueue.enqueue(5);
        linkedListQueue.enqueue(15);
        linkedListQueue.enqueue(25);
        System.out.println("LinkedListQueue после добавления элементов (enqueue):");
        linkedListQueue.printQueue();

        // Удаляем элемент из очереди
        System.out.println("Вызов метода dequeue() — удаление первого элемента");
        linkedListQueue.dequeue();
        System.out.println("LinkedListQueue после удаления одного элемента:");
        linkedListQueue.printQueue();

        // Просмотр первого элемента
        System.out.println("Вызов метода peek() — просмотр первого элемента");
        System.out.println("Первый элемент в очереди: " + linkedListQueue.peek());

        System.out.println("-----------------------------------");

        // Тестирование LinkedListStack
        System.out.println("Тестирование LinkedListStack:");
        LinkedListStack linkedListStack = new LinkedListStack();

        // Добавляем элементы в стек
        linkedListStack.push(50);
        linkedListStack.push(60);
        linkedListStack.push(70);
        System.out.println("LinkedListStack после добавления элементов (push):");
        linkedListStack.printStack();

        // Удаляем элемент из стека
        System.out.println("Вызов метода pop() — удаление верхнего элемента");
        linkedListStack.pop();
        System.out.println("LinkedListStack после удаления одного элемента:");
        linkedListStack.printStack();

        // Просмотр верхнего элемента
        System.out.println("Вызов метода peek() — просмотр верхнего элемента");
        System.out.println("Верхний элемент в стеке: " + linkedListStack.peek());
    }
}
