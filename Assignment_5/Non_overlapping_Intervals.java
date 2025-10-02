import java.util.Arrays;
import java.util.Scanner;

public class Non_overlapping_Intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];
        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }
        System.out.println(Overlap(nums));
    }
    public static  int Overlap(int[][] arr){
        Arrays.sort(arr, (a,b) -> Integer.compare(a[1],b[1]));
        int end = arr[0][1];
        int count=0;
        for(int i=1; i<arr.length; i++){
            if(end<=arr[i][0]){
                end=arr[i][1];
            }
            else{
                count++;
            }
        }
        return count;
    }
}


// TC :- O(nlogn)

// SC :- O(1)