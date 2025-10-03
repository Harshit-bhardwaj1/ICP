import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candidates = new int[n];
        int target = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(candidates);
        Combination(ans,ll,target,candidates,0);
        System.out.println(ans);
    }
    public  static void Combination(List<List<Integer>> ans, List<Integer> ll ,int amount, int[] candidates, int idx){
        if(amount==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx; i<candidates.length; i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]> amount) break;
            
            ll.add(candidates[i]);
            Combination(ans,ll, amount-candidates[i],candidates,i+1);
            ll.remove(ll.size()-1);
        }
    }
}


// TC (approx): O(2^n.k)

// 2^n → number of subset possibilities

// k → time to copy the current combination when we add it to the result


// SC: 𝑂( 𝑘 +𝑚 .k)

// Result list: depends on number of valid combinations → let’s call it O(m * k) where m is number of solutions
