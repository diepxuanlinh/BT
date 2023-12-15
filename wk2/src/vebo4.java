import java.sql.Array;
import java.util.*;

public class vebo4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 1; i <= n;i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int l, r;
        while (q > 0){
            l =sc.nextInt();
            r = sc.nextInt();
            PriorityQueue priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i = l; i<= r;i++){
                priorityQueue.add(arr[i]);
            }
            System.out.println(priorityQueue.poll());

        }


    }
}
