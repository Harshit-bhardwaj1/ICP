import java.util.Scanner;
import java.util.Stack;

public class Asteroid_Collision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int res[] = Asteroid(a);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static int[] Asteroid(int[] nums){
        Stack<Integer> st = new Stack<>();

        for(int a : nums){
            boolean destroyed = false;
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(Math.abs(a)>st.peek()){
                    st.pop();
                }
                else if(Math.abs(a)==st.peek()){
                    st.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }

            if(!destroyed){
                st.push(a);
            }
        }
        int[] result = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
