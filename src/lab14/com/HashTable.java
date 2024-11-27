package lab14.com;

import java.util.LinkedList;

class HashTable<K, V> {
    private final int capacity; // Размер хеш-таблицы
    private final LinkedList<Entry<K, V>>[] table; // Таблица цепочек
    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;}
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];
        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение, если ключ уже существует
                return;
            }
        }
        chain.add(new Entry<>(key, value));}
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];

        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Элемент не найден
    }
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];

        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                chain.remove(entry);
                return;
            }
        }
    }
    public void display() {
        for (int i = 0; i < capacity; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry<K, V> entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }
    private static class Entry<K, V> {
        private final K key;
        private V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
