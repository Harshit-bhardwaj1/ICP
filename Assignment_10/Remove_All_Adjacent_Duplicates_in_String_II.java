import java.util.Scanner;
import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(Remove(s, k));
    }
    public static String Remove(String s, int k){
        Stack<int[]> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() && st.peek()[0]==c){
                st.peek()[1]++;
            }
            else{
                st.push(new int[]{c,1});
            }

            if(st.peek()[1]==k){
                st.pop();
            }
        }
        for (int[] pair : st) {
            for (int i = 0; i < pair[1]; i++) {
                sb.append((char) pair[0]);
            }
        }
        return sb.toString();
    }
}
