package lab9.com;

public class LCS {
    // Метод для нахождения длины LCS и самой подпоследовательности
    public static String findLCS(String A, String B) {
        int m = A.length();
        int n = B.length();
        int[][] dp = new int[m + 1][n + 1];

        // Заполнение таблицы dp
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        // Реконструкция LCS
        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (A.charAt(i - 1) == B.charAt(j - 1)) {
                lcs.append(A.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }
}
