package lab1.com;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.print(); // Вывод: 1 2 3

        array.remove(1);
        array.print(); // Вывод: 1 3
    }
}
