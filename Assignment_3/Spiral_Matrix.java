import java.util.Scanner;

public class Spiral_Matrix {
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
        Print(arr);
    }
    public static void Print(int[][] arr){
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc= arr[0].length-1;
        int te= arr.length*arr[0].length;
        int c=0;
        while(c<te){
            for(int i= minc; i<=maxc && c<te; i++){
                System.out.print(arr[minr][i]+" ");
                c++;
            }
            minr++;

            for(int i= minr; i<=maxr && c<te; i++){
                System.out.print(arr[i][maxc]+" ");
                c++;
            }
            maxc--;
            for(int i= maxc; i>=minc && c<te; i--){
                System.out.print(arr[maxr][i]+" ");
                c++;
            }
            maxr--;
            for(int i= maxr; i>=minr && c<te; i--){
                System.out.print(arr[i][minc]+" ");
                c++;
            }
            minc++;
        }
    }
}


// Time Complexity = O(m*n)

// Space Complexity = O(1)