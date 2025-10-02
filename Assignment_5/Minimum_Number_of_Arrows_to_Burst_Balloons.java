
import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(MinArrow(arr));
    }
    public static int MinArrow(int[][] arr){
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int arrow=1;
        int arrowpos= arr[0][1];

        for(int i=0; i<arr.length; i++){
            if(arr[i][0]> arrowpos){
                arrow++;
                arrowpos=arr[i][1];
            }
        }
        return arrow;
    }
}


// TC = O(n log n)

// SC = O(1)