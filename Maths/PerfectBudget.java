import java.util.Scanner;

public class PerfectBudget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // total amount of money
        int M = scanner.nextInt();  // total types of materials

        int[] quantityAvailable = new int[M];
        int[] quantityNeeded = new int[M];
        int[] costOfOneUnit = new int[M];
        int[] sellingPrice = new int[M];

        // Input quantities available for each material
        for (int i = 0; i < M; i++) {
            quantityAvailable[i] = scanner.nextInt();
        }

        // Input quantities needed for each material to make the toy
        for (int i = 0; i < M; i++) {
            quantityNeeded[i] = scanner.nextInt();
        }

        // Input cost of one unit for each material
        for (int i = 0; i < M; i++) {
            costOfOneUnit[i] = scanner.nextInt();
        }

        // Input selling price for each type of toy
        for (int i = 0; i < M; i++) {
            sellingPrice[i] = scanner.nextInt();
        }

        int maxAmount = getMaxAmount(N, M, quantityAvailable, quantityNeeded, costOfOneUnit, sellingPrice);
        System.out.println(maxAmount);
    }

    private static int getMaxAmount(int N, int M, int[] quantityAvailable, int[] quantityNeeded,
                                    int[] costOfOneUnit, int[] sellingPrice) {
        int[][] dp = new int[M + 1][N + 1];

        for (int i = 1; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= quantityAvailable[i - 1] && k * costOfOneUnit[i - 1] <= j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - k * costOfOneUnit[i - 1]] + k * sellingPrice[i - 1]);
                }
            }
        }

        return dp[M][N];
    }
}
