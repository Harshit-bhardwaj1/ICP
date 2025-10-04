
import java.util.Arrays;
import java.util.Scanner;

public class Unique_Paths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(uniquePaths(m, n));
    }
    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[n - 1];
    }
}


// Time Complexity

// Filling the DP table requires visiting every cell once.

// O(m * n)

// Space Complexity

// If we use a full 2D DP table → O(m * n)

// If we optimize with a single 1D array (rolling row) → O(n)