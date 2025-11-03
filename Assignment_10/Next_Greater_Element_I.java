import java.util.Scanner;

public class Next_Greater_Element_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        int[] ans = new int[nums1.length];
        int idx=0;
        for(int i=0; i<nums1.length; i++){
            int j =Find(nums1[i],nums2);
            if(j==-1){
                ans[idx++]=j;
            }
            else{
                ans[idx++]=Next(j,nums1[i],nums2);
            }
        }
        System.out.println(ans);
    }
    public static int Find(int item, int[] nums2){
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static int Next(int idx, int item, int[] nums){
        for(int i=idx; i<nums.length; i++){
            if(nums[i]>item){
                return nums[i];
            }
        }
        return -1;
    }
}
