import java.util.Scanner;

public class Search_a_2D_Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println(Search(arr, target));
    }
    public static boolean Search(int[][] arr, int target){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0; i<row; i++){
            if(target>=arr[i][0] && target<=arr[i][col-1]){
                int lo=0;
                int hi=col-1;
                while(lo<=hi){
                    int mid= (lo+hi)/2;
                    if(arr[i][mid]==target){
                        return true;
                    }
                    else if(arr[i][mid]<target){
                        lo=mid+1;
                    }
                    else{
                        hi=mid-1;
                    }
                }
            }
        }
        return false;
    }
}

// Time Complexity = O(log(m*n));
// Space Complexity = O(1)