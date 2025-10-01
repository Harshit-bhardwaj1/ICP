import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Print(s));
    }
    public static int Print(String s){
        int[] freq=new int[256];
        int ans=0;
        int ei=0;
        int si=0;
        while(ei<s.length()){
            char ch= s.charAt(ei);
            freq[ch]++;

            while(freq[ch]>1){
                freq[s.charAt(si)]--;
                si++;
            }

            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}


// Time Complexity :- O(n)
// Space Complexity :- O(1)