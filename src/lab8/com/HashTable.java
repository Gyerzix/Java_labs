package lab8.com;

public class HashTable {
    private static class HashNode {
        String key;
        String value;
        boolean isDeleted;

        public HashNode(String key, String value) {
            this.key = key;
            this.value = value;
            this.isDeleted = false;
        }
    }
    private HashNode[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    public HashTable() {
        table = new HashNode[DEFAULT_CAPACITY];
        size = 0;
    }
    private int hash(String key) {
        return Math.abs(key.hashCode()) % table.length;
    }
    private void resize() {
        HashNode[] oldTable = table;
        table = new HashNode[oldTable.length * 2];
        size = 0;

        for (HashNode node : oldTable) {
            if (node != null && !node.isDeleted) {
                insert(node.key, node.value);
            }
        }
    }
    public void insert(String key, String value) {
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }
        int index = hash(key);
        while (table[index] != null && !table[index].isDeleted && !table[index].key.equals(key)) {
            index = (index + 1) % table.length; // Линейное пробирование
        }
        if (table[index] == null || table[index].isDeleted) {
            table[index] = new HashNode(key, value);
            size++;
        } else {
            table[index].value = value; // Обновление значения
        }
    }
    public String search(String key) {
        int index = hash(key);
        int startIndex = index;
        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) { // Возвращение в начальную точку
                break;
            }
        }
        return null; // Элемент не найден
    }
    public void delete(String key) {
        int index = hash(key);
        int startIndex = index;
        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                table[index].isDeleted = true;
                size--;
                return;
            }
            index = (index + 1) % table.length;
            if (index == startIndex) { // Возвращение в начальную точку
                break;
            }
        }
    }
    public void printTable() {
        System.out.println("Hash Table:");
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null || table[i].isDeleted) {
                System.out.println(i + ": null");
            } else {
                System.out.println(i + ": " + table[i].key + " -> " + table[i].value);
            }
        }
    }
}

