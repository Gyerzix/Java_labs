package lab2.com;

public class Main {
    public static void main(String[] args) {
        // push: добавляет элемент на вершину стека.
        // pop: удаляет и возвращает элемент с вершины стека.
        // peek: позволяет взглянуть на элемент на вершине стека, не удаляя его.

        // Использование стека на массиве
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        System.out.println("ArrayStack peek: " + arrayStack.peek());
        System.out.println("ArrayStack pop: " + arrayStack.pop());

        // Использование стека на связном списке
        LinkedListStack linkedListStack = new LinkedListStack();
        linkedListStack.push(3);
        linkedListStack.push(4);
        System.out.println("LinkedListStack peek: " + linkedListStack.peek());
        System.out.println("LinkedListStack pop: " + linkedListStack.pop());

        //enqueue: добавляет элемент в конец очереди.
        //dequeue: удаляет и возвращает элемент с начала очереди.
        //peek: позволяет взглянуть на элемент в начале очереди, не удаляя его.

        // Использование очереди на массиве
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        System.out.println("ArrayQueue peek: " + arrayQueue.peek());
        System.out.println("ArrayQueue dequeue: " + arrayQueue.dequeue());

        // Использование очереди на связном списке
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enqueue(7);
        linkedListQueue.enqueue(8);
        System.out.println("LinkedListQueue peek: " + linkedListQueue.peek());
        System.out.println("LinkedListQueue dequeue: " + linkedListQueue.dequeue());
    }
}

