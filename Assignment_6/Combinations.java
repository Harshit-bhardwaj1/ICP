
import java.util.*;

public class Combinations {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Combine(ll,ans,n,k,1);
        System.out.println(ll);
    }
    public static void Combine(List<Integer> ll, List<List<Integer>> ans,int n, int k, int idx){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<=n; i++){
            ll.add(i);
            Combine(ll,ans,n,k,i+1);
            ll.remove(ll.size()-1);
        }
    }
}


// Time Complexity

// O(C(n, k) * k)
// because there are C(n, k) combinations, and copying each list takes O(k).

// Space Complexity

// O(k) recursion depth + result storage.