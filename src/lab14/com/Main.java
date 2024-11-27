package lab14.com;

public class Main {
    public static void main(String[] args) {
        // Создаём хеш-таблицу с размером 5
        HashTable<String, Integer> hashTable = new HashTable<>(5);

        // Вставляем элементы
        hashTable.put("Alice", 25);
        hashTable.put("Bob", 30);
        hashTable.put("Charlie", 35);
        hashTable.put("Dave", 40);

        // Выводим таблицу
        System.out.println("Hash Table after insertions:");
        hashTable.display();

        // Поиск элементов
        System.out.println("\nSearching for Bob: " + hashTable.get("Bob")); // 30
        System.out.println("Searching for Eve: " + hashTable.get("Eve"));   // null

        // Удаление элемента
        System.out.println("\nRemoving Charlie...");
        hashTable.remove("Charlie");

        // Вывод таблицы после удаления
        System.out.println("Hash Table after deletion:");
        hashTable.display();
    }
}
