import java.util.Scanner;

public class Valid_Prefect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(IsPerfectSquare(n));
    }
    public static boolean IsPerfectSquare(int num){
        long lo=0;
        long hi=num/2;
        if(num<2){
            return true;
        }
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}
