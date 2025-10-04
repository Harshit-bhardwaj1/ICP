
import java.util.Arrays;
import java.util.Scanner;

public class House_Robber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(Robber(arr, 0, dp));
    }
    public static int Robber(int[] arr, int i, int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob= arr[i] + Robber(arr, i+2, dp);
        int Dont_rob=Robber(arr, i+1, dp);
        return dp[i]= Math.max(rob, Dont_rob);
    }
}


// Time Complexity: O(n) because each house’s result is computed once thanks to memoization.

// Space Complexity: O(n) for the dp array + recursion stack of O(n) → overall O(n).