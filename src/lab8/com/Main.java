package lab8.com;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Вставка элементов
        hashTable.insert("apple", "A fruit");
        hashTable.insert("banana", "A yellow fruit");
        hashTable.insert("grape", "A small fruit");
        hashTable.insert("melon", "A large fruit");

        // Вывод таблицы
        hashTable.printTable();

        // Поиск элементов
        System.out.println("\nSearch Results:");
        System.out.println("apple: " + hashTable.search("apple")); // A fruit
        System.out.println("banana: " + hashTable.search("banana")); // A yellow fruit
        System.out.println("cherry: " + hashTable.search("cherry")); // null

        // Удаление элемента
        System.out.println("\nDeleting 'banana'");
        hashTable.delete("banana");
        hashTable.printTable();

        // Проверка поиска после удаления
        System.out.println("\nSearch after deletion:");
        System.out.println("banana: " + hashTable.search("banana")); // null
    }
}
