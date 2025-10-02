import java.util.Scanner;

public class Lemonade_Change {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(change(nums));
    }
    public static boolean change(int[] arr){
        int count5=0;
        int count10=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==5){
                count5++;
            }
            else if(arr[i]==10){
                if(count5>0){
                    count5--;
                }
                else{
                    return false;
                }
                count10++;
            }
            else{
                if(count10>0 && count5>0){
                    count10--;
                    count5--;
                }
                else if(count5>=3){
                    count5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}

// TC :- O(n)

// SC :- O(1)