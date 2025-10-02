
import java.util.*;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        System.out.println(Anagrams(s, p));
    }
    public static List<Integer> Anagrams(String s, String p){
        int[] freq = new int[26];
        for(char ch : p.toCharArray()){
            freq[ch-'a']++;
        }
        int si=0;
        int ei=0;
        int count = p.length();
        List<Integer> ll = new ArrayList<>();
        while(ei<s.length()){
            if(freq[s.charAt(ei)-'a']-->0){
                count--;
            }
            ei++;
            if(count==0 && (ei - si) == p.length()){
                ll.add(si);
            }
            if((ei-si+1)>p.length() ){
                if(freq[s.charAt(si++)-'a']++ >=0){
                    count++;
                }
            }
        }
        return ll;
    }
}
