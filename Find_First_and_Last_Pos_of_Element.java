import java.util.Scanner;

public class Find_First_and_Last_Pos_of_Element{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();

        int [] nums = new int[2];
        nums[0]=search(arr,target,0);
        nums[1]=search(arr,target,1);

        for(int x:nums){
            System.out.println(x);
        }
    }
    public static int search(int[] nums, int target, int pos){
        int lo=0;
        int hi= nums.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==target){
                ans=mid;
                if(pos==0){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else if(nums[mid]>target){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
}