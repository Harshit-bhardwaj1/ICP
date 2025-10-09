import java.util.*;

public class Simplify_Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println(Simplify(path));
    }
    public static String Simplify(String path){
        Stack<String> st = new Stack<>();
        String[] parts = path.split("/");

        for(String s : parts){
            if(s.equals("") || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(s);
            }
        }

        StringBuilder str = new StringBuilder();

        for(String s :st){
            str.append("/").append(s);
        }

        return str.length()==0 ? "/" : str.toString();
    }
}
