
import java.util.Scanner;

public class Permutation_in_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        System.out.println(Check(s1,s2));
    }
    public static boolean Check(String s1, String s2) {
        int[] charCount = new int[26];
        
        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        int left = 0, right = 0, required = s1.length();
        
        // Sliding window over s2
        while (right < s2.length()) {
            // Decrease count if character is part of s1
            if (charCount[s2.charAt(right++) - 'a']-- > 0) {
                required--;
            }
            
            // If all characters match, return true
            if (required == 0) return true;
            
            // Maintain window size equal to s1.length()
            if (right - left == s1.length() && charCount[s2.charAt(left++) - 'a']++ >= 0) {
                required++;
            }
        }
        
        return false;
    }
}


// Time complexity :- O(|s1| + |s2|)

// Space Complexity :- O(1)