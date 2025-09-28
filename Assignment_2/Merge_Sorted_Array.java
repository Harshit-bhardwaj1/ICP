
import java.util.*;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n= sc.nextInt();
        int[] nums1= new int[m+n];
        int[] nums2= new int[n];

        for(int i=0; i<m; i++){
            nums1[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i]=sc.nextInt();
        }
        merge(nums1,m,nums2,n);

        for(int i=0; i<m+n; i++){
            System.out.println(nums1[i]);
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i= m-1;
        int j=n-1;
        int idx= m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx]=nums1[i];
                i--;
                idx--;
            }
            else{
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }
        }
        while(j>=0){
            nums1[idx]=nums2[j];
            j--;
            idx--;
        }
    }
}
