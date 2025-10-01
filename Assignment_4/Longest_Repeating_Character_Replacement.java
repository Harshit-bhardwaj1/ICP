
import java.util.Scanner;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(Print(s, k));
    }
    public static int Print(String s, int k){
        int[] charCount = new int[26];
        int si=0;
        int ei=0;
        int ans=0;
        int max=0;
        while(ei<s.length()){
            char ch = s.charAt(ei);
            charCount[ch-'A']++;
            max = Math.max(max,charCount[ch-'A']);

            if((ei-si+1)-max>k){
                charCount[s.charAt(si)-'A']--;
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}


// Time Complexity :- O(n);
// Space Complexity :- 