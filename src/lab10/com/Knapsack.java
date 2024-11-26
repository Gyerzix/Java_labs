package lab10.com;

public class Knapsack {
    // Метод для решения задачи о рюкзаке
    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;

        // Создаём таблицу dp размером (n+1) x (capacity+1)
        int[][] dp = new int[n + 1][capacity + 1];

        // Заполняем таблицу dp
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    // Максимум между: включить текущий предмет или не включать
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    // Если предмет не помещается
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // dp[n][capacity] содержит максимальную стоимость
        return dp[n][capacity];
    }
    // Метод для восстановления выбранных предметов
    public static void printSelectedItems(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        // Заполняем таблицу dp
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        // Восстанавливаем предметы
        int w = capacity;
        System.out.println("Selected items (index, weight, value):");
        for (int i = n; i > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                System.out.printf("Item %d: Weight = %d, Value = %d\n", i - 1, weights[i - 1], values[i - 1]);
                w -= weights[i - 1];
            }
        }
    }
}
