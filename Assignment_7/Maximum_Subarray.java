
import java.util.Scanner;

public class Maximum_Subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Maximum_Sum(arr));
    }
    public static int Maximum_Sum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}


// TC = O(n)

// SC = O(1)