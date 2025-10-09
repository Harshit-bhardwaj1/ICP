import java.util.*;


public class Online_Stock_Span {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stock = new int[n];
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        Cal_Span(stock);
    }
    public static void Cal_Span(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<int[]> st = new Stack<>(); // each element: {price, span}

        for (int i = 0; i < arr.length; i++) {
            int price = arr[i];
            int span = 1;

            // Pop all previous prices <= current and add their spans
            while (!st.isEmpty() && st.peek()[0] <= price) {
                span += st.pop()[1];
            }

            st.push(new int[]{price, span});
            ans[i] = span;
        }

        for (int s : ans) {
            System.out.print(s + " ");
        }
    }
}
