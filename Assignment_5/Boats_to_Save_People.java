import java.util.Arrays;
import java.util.Scanner;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int limit = sc.nextInt();
        System.out.println(Rescue(nums, limit));
    }
    public static int Rescue(int[] arr, int limit) {
        Arrays.sort(arr);
        int i = 0;                 // lightest
        int j = arr.length - 1;    // heaviest
        int boats = 0;

        while (i <= j) {
            if (arr[i] + arr[j] <= limit) {
                i++;  // pair lightest with heaviest
            }
            j--;      // heaviest always goes
            boats++;
        }

        return boats;
    }
}

// TC :- O(n log n)

//SC :- O(1)