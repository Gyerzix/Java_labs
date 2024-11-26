package lab9.com;

public class Main {
    public static void main(String[] args) {
        // Тестовые данные
        String[][] testCases = {
                {"AGGTAB", "GXTXAYB"}, // Пример из задачи
                {"ABCBDAB", "BDCAB"},  // Другой пример
                {"HELLO", "WORLD"},    // Непересекающиеся символы
                {"ABC", "ABC"},        // Полное совпадение
                {"", ""},              // Пустые строки
                {"A", "B"},            // Однобуквенные строки без совпадений
                {"ABCD", "ACBAD"}      // Сложный случай
        };

        // Заголовок для вывода
        System.out.println("Testing Longest Common Subsequence (LCS) Algorithm:");
        System.out.println("---------------------------------------------------");

        // Тестируем каждую пару строк
        for (int i = 0; i < testCases.length; i++) {
            String A = testCases[i][0];
            String B = testCases[i][1];

            // Вычисляем LCS
            String lcs = LCS.findLCS(A, B);

            // Выводим результаты
            System.out.printf("Test Case %d:\n", i + 1);
            System.out.println("String A: " + A);
            System.out.println("String B: " + B);
            System.out.println("Longest Common Subsequence: " + (lcs.isEmpty() ? "None" : lcs));
            System.out.println("---------------------------------------------------");
        }
    }
}
