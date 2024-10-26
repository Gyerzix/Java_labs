package lab1.com;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(10);
        array.add(5);
        array.add(10);
        System.out.println("Размер массива: " + array.size());
        System.out.println("Первый элемент массива MyArray: " + array.get(0));
        System.out.println("Второй элемент массива MyArray: " + array.get(1));

        System.out.println("------------------------------------");

        SinglyLinkedList singlyList = new SinglyLinkedList();
        singlyList.add(1);
        singlyList.add(2);
        System.out.println("Выведем элементы до remove:");
        singlyList.printList();
        singlyList.remove(1);
        System.out.println("Выведем элементы после remove:");
        singlyList.printList();
        System.out.println("Проверим содержание элемента 2 в связном списке: " + singlyList.contains(2));

        System.out.println("------------------------------------");

        DoublyLinkedList doublyList = new DoublyLinkedList();
        doublyList.add(3);
        doublyList.add(4);
        System.out.println("Выведем элементы до remove:");
        doublyList.printList();
        doublyList.remove(3);
        System.out.println("Выведем элементы после remove:");
        doublyList.printList();
        System.out.println("Проверим содержание элемента 4 в двусвязном списке: " + doublyList.contains(4));
    }
}
