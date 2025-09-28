
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }

        for(int i=k; i<arr.length; i++){
            if(arr[i]>pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}
