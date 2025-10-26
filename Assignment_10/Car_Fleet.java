import java.util.Arrays;
import java.util.Scanner;

public class Car_Fleet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int nums2[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(CarFleet(target, nums1, nums2));
    }
    public static int CarFleet(int target, int[] position, int[] speed){
        int n = position.length;

        int [][] cars = new int[n][2];
        for(int i=0; i<n; i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars, (a,b) -> b[0]-a[0]);
        int fleets = 0;
        double timePrev = 0;
        for(int i=0; i<n; i++){
            double timeCurr = (double)(target - cars[i][0]) / cars[i][1];

            if (timeCurr > timePrev) {
                fleets++;
                timePrev = timeCurr;
            }
        }
        return fleets;
    }
}
