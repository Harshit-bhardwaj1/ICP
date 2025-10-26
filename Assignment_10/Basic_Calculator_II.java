import java.util.Scanner;
import java.util.Stack;

public class Basic_Calculator_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Calculate(s));
    }
    public static int Calculate(String s) {
        int curr = 0;
        char op = '+';
        char arr[] = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) {
                curr = curr * 10 + arr[i] - '0';
            }
            if ((!Character.isDigit(arr[i]) && arr[i] != ' ') || i == arr.length - 1) {
                if (op == '+') {
                    st.push(curr);
                } else if (op == '-') {
                    st.push(-curr);
                } else if (op == '*') {
                    st.push(curr * st.pop());
                } else if (op == '/') {
                    st.push(st.pop() / curr);
                }
                op = arr[i];
                curr = 0;
            }
        }
        int sum = 0;
        while (!st.empty()) {
            sum += st.pop();
        }
        return sum;
    }
}
