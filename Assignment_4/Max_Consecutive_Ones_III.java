
import java.util.Scanner;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        System.out.println(Longest(arr,k));
    }
    public static int Longest(int[] arr, int k){
        int si=0;
        int ei=0;
        int zeroes=0;
        int ans=0;
        while(ei<arr.length){
            if(arr[ei]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(arr[si]==0){
                    zeroes--;
                }
                si++;
            }
            ans= Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}

// TC :- O(n)

// SC:- O(1)