package lab10.com;

public class Main {
    public static void main(String[] args) {
        // Пример данных
        int[] weights = {2, 3, 4, 5};
        int[] values = {3, 4, 5, 6};
        int capacity = 5;

        // Решение задачи
        int maxProfit = Knapsack.knapsack(weights, values, capacity);
        System.out.println("Maximum profit: " + maxProfit);

        // Вывод выбранных предметов
        Knapsack.printSelectedItems(weights, values, capacity);
    }
}
